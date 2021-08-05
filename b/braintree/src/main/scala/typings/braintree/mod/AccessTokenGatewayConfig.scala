package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenGatewayConfig
  extends StObject
     with GatewayConfig {
  
  var accessToken: String
}
object AccessTokenGatewayConfig {
  
  inline def apply(accessToken: String): AccessTokenGatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenGatewayConfig]
  }
  
  extension [Self <: AccessTokenGatewayConfig](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
  }
}
