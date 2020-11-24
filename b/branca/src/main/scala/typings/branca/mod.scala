package typings.branca

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branca", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(key: String): Branca = js.native
  
  @js.native
  trait Branca extends js.Object {
    
    def decode(token: String): Buffer = js.native
    def decode(token: String, ttl: Double): Buffer = js.native
    
    def encode(message: String): String = js.native
    def encode(message: String, timestamp: Double): String = js.native
    
    def timestamp(token: String): Double = js.native
  }
}
