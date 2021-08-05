package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientToken extends StObject {
  
  var clientToken: String
}
object ClientToken {
  
  inline def apply(clientToken: String): ClientToken = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientToken]
  }
  
  extension [Self <: ClientToken](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
  }
}
