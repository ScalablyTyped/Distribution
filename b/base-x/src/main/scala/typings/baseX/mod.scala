package typings.baseX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ALPHABET: String): BaseConverter = ^.asInstanceOf[js.Dynamic].apply(ALPHABET.asInstanceOf[js.Any]).asInstanceOf[BaseConverter]
  
  @JSImport("base-x", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait BaseConverter extends StObject {
    
    def decode(string: String): js.typedarray.Uint8Array = js.native
    
    def decodeUnsafe(string: String): js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    def encode(buffer: js.Array[Double]): String = js.native
    def encode(buffer: js.typedarray.Uint8Array): String = js.native
  }
}
