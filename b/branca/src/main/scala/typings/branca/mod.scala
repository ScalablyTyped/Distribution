package typings.branca

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("branca", JSImport.Namespace)
  @js.native
  def apply(key: String): Branca = js.native
  
  @js.native
  trait Branca extends StObject {
    
    def decode(token: String): Buffer = js.native
    def decode(token: String, ttl: Double): Buffer = js.native
    
    def encode(message: String): String = js.native
    def encode(message: String, timestamp: Double): String = js.native
    
    def timestamp(token: String): Double = js.native
  }
}
