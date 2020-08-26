package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that the tracking options should be associated with.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  var TrackingOptions: typings.awsSdk.sesMod.TrackingOptions = js.native
}

object CreateConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): CreateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
  }
  @scala.inline
  implicit class CreateConfigurationSetTrackingOptionsRequestOps[Self <: CreateConfigurationSetTrackingOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = this.set("TrackingOptions", value.asInstanceOf[js.Any])
  }
  
}

