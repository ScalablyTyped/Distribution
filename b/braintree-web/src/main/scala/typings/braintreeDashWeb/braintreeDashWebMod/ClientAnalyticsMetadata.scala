package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is returned by {@link Client#getConfiguration|getConfiguration}. This information is used extensively by other Braintree modules to properly configure themselves.
  * @property {object} client The braintree-web/client parameters.
  * @property {string} client.authorization A tokenizationKey or clientToken.
  * @property {object} gatewayConfiguration Gateway-supplied configuration.
  * @property {object} analyticsMetadata Analytics-specific data.
  * @property {string} analyticsMetadata.sessionId Uniquely identifies a browsing session.
  * @property {string} analyticsMetadata.sdkVersion The braintree.js version.
  * @property {string} analyticsMetadata.merchantAppId Identifies the merchant's web app.
  */
trait ClientAnalyticsMetadata extends js.Object {
  var merchantAppId: String
  var sdkVersion: String
  var sessionId: String
}

object ClientAnalyticsMetadata {
  @scala.inline
  def apply(merchantAppId: String, sdkVersion: String, sessionId: String): ClientAnalyticsMetadata = {
    val __obj = js.Dynamic.literal(merchantAppId = merchantAppId.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientAnalyticsMetadata]
  }
}

