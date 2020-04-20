package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set for which you want to update the custom tracking domain.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  var TrackingOptions: typings.awsSdk.sesMod.TrackingOptions = js.native
}

object UpdateConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): UpdateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetTrackingOptionsRequest]
  }
}

