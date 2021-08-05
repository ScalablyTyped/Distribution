package typings.baseX

import typings.node.Buffer
import typings.std.Uint8Array
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
    
    def decode(string: String): Buffer = js.native
    
    def decodeUnsafe(string: String): js.UndefOr[Buffer] = js.native
    
    def encode(buffer: js.Array[Double]): String = js.native
    def encode(buffer: Buffer): String = js.native
    def encode(buffer: Uint8Array): String = js.native
  }
}
