package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var analyticsMetadata: ClientAnalyticsMetadata
  var client: Client
  var gatewayConfiguration: js.Any
}

object Configuration {
  @scala.inline
  def apply(analyticsMetadata: ClientAnalyticsMetadata, client: Client, gatewayConfiguration: js.Any): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyticsMetadata")(analyticsMetadata)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("gatewayConfiguration")(gatewayConfiguration)
    __obj.asInstanceOf[Configuration]
  }
}

