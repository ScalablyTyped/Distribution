package typings.branca

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(key: String): Branca = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Branca]
  inline def apply(key: Buffer): Branca = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Branca]
  
  @JSImport("branca", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Branca extends StObject {
    
    def decode(token: String): Buffer = js.native
    def decode(token: String, ttl: Double): Buffer = js.native
    
    def encode(message: String): String = js.native
    def encode(message: String, timestamp: Double): String = js.native
    
    def timestamp(token: String): Double = js.native
  }
}
