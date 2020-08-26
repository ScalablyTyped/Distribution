package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationSetResponse extends js.Object {
  /**
    * The configuration set object associated with the specified configuration set.
    */
  var ConfigurationSet: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSet] = js.native
  var DeliveryOptions: js.UndefOr[typings.awsSdk.sesMod.DeliveryOptions] = js.native
  /**
    * A list of event destinations associated with the configuration set. 
    */
  var EventDestinations: js.UndefOr[typings.awsSdk.sesMod.EventDestinations] = js.native
  /**
    * An object that represents the reputation settings for the configuration set. 
    */
  var ReputationOptions: js.UndefOr[typings.awsSdk.sesMod.ReputationOptions] = js.native
  /**
    * The name of the custom open and click tracking domain associated with the configuration set.
    */
  var TrackingOptions: js.UndefOr[typings.awsSdk.sesMod.TrackingOptions] = js.native
}

object DescribeConfigurationSetResponse {
  @scala.inline
  def apply(): DescribeConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationSetResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationSetResponseOps[Self <: DescribeConfigurationSetResponse] (val x: Self) extends AnyVal {
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
    def setConfigurationSet(value: ConfigurationSet): Self = this.set("ConfigurationSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSet: Self = this.set("ConfigurationSet", js.undefined)
    @scala.inline
    def setDeliveryOptions(value: DeliveryOptions): Self = this.set("DeliveryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryOptions: Self = this.set("DeliveryOptions", js.undefined)
    @scala.inline
    def setEventDestinationsVarargs(value: EventDestination*): Self = this.set("EventDestinations", js.Array(value :_*))
    @scala.inline
    def setEventDestinations(value: EventDestinations): Self = this.set("EventDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDestinations: Self = this.set("EventDestinations", js.undefined)
    @scala.inline
    def setReputationOptions(value: ReputationOptions): Self = this.set("ReputationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReputationOptions: Self = this.set("ReputationOptions", js.undefined)
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = this.set("TrackingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingOptions: Self = this.set("TrackingOptions", js.undefined)
  }
  
}

