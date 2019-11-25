package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayConfig extends js.Object {
  var environment: Environment
  var merchantId: String
  var privateKey: String
  var publicKey: String
}

object GatewayConfig {
  @scala.inline
  def apply(environment: Environment, merchantId: String, privateKey: String, publicKey: String): GatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], merchantId = merchantId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatewayConfig]
  }
}

