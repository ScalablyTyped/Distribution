package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGatewayConfig extends GatewayConfig {
  var clientId: String
  var clientSecret: String
}

object ClientGatewayConfig {
  @scala.inline
  def apply(clientId: String, clientSecret: String): ClientGatewayConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGatewayConfig]
  }
}

