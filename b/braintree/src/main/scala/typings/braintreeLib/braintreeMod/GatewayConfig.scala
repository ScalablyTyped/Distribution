package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayConfig extends js.Object {
  var environment: js.Any
  var merchantId: java.lang.String
  var privateKey: java.lang.String
  var publicKey: java.lang.String
}

object GatewayConfig {
  @scala.inline
  def apply(
    environment: js.Any,
    merchantId: java.lang.String,
    privateKey: java.lang.String,
    publicKey: java.lang.String
  ): GatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment, merchantId = merchantId, privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[GatewayConfig]
  }
}

