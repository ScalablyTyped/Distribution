package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.braintree.mod.KeyGatewayConfig
  - typings.braintree.mod.ClientGatewayConfig
  - typings.braintree.mod.AccessTokenGatewayConfig
*/
trait GatewayConfig extends js.Object
object GatewayConfig {
  
  @scala.inline
  def KeyGatewayConfig(environment: Environment, merchantId: String, privateKey: String, publicKey: String): GatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], merchantId = merchantId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayConfig]
  }
  
  @scala.inline
  def ClientGatewayConfig(clientId: String, clientSecret: String): GatewayConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayConfig]
  }
  
  @scala.inline
  def AccessTokenGatewayConfig(accessToken: String): GatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayConfig]
  }
}
