package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientToken extends StObject {
  
  var clientToken: String = js.native
}
object ClientToken {
  
  @scala.inline
  def apply(clientToken: String): ClientToken = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientToken]
  }
  
  @scala.inline
  implicit class ClientTokenMutableBuilder[Self <: ClientToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
  }
}
