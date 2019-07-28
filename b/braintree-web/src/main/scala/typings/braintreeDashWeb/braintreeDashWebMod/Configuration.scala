package typings.braintreeDashWeb.braintreeDashWebMod

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
    val __obj = js.Dynamic.literal(analyticsMetadata = analyticsMetadata, client = client, gatewayConfiguration = gatewayConfiguration)
  
    __obj.asInstanceOf[Configuration]
  }
}

