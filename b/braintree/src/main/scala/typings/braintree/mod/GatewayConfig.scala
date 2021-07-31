package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.braintree.mod.KeyGatewayConfig
  - typings.braintree.mod.ClientGatewayConfig
  - typings.braintree.mod.AccessTokenGatewayConfig
*/
trait GatewayConfig extends StObject
object GatewayConfig {
  
  @scala.inline
  def AccessTokenGatewayConfig(accessToken: String): typings.braintree.mod.AccessTokenGatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.AccessTokenGatewayConfig]
  }
  
  @scala.inline
  def ClientGatewayConfig(clientId: String, clientSecret: String): typings.braintree.mod.ClientGatewayConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.ClientGatewayConfig]
  }
  
  @scala.inline
  def KeyGatewayConfig(environment: Environment, merchantId: String, privateKey: String, publicKey: String): typings.braintree.mod.KeyGatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], merchantId = merchantId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.braintree.mod.KeyGatewayConfig]
  }
}
