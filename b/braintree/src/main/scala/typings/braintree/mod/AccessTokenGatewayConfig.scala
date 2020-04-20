package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenGatewayConfig extends GatewayConfig {
  var accessToken: String
}

object AccessTokenGatewayConfig {
  @scala.inline
  def apply(accessToken: String): AccessTokenGatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenGatewayConfig]
  }
}

