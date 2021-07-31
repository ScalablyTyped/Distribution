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
  
  @scala.inline
  def apply(accessToken: String): AccessTokenGatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenGatewayConfig]
  }
  
  @scala.inline
  implicit class AccessTokenGatewayConfigMutableBuilder[Self <: AccessTokenGatewayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
  }
}
