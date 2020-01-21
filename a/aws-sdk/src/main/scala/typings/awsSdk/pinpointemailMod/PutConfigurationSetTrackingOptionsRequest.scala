package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to add a custom tracking domain to.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  /**
    * The domain that you want to use to track open and click events.
    */
  var CustomRedirectDomain: js.UndefOr[typings.awsSdk.pinpointemailMod.CustomRedirectDomain] = js.native
}

object PutConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, CustomRedirectDomain: CustomRedirectDomain = null): PutConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (CustomRedirectDomain != null) __obj.updateDynamic("CustomRedirectDomain")(CustomRedirectDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
  }
}

