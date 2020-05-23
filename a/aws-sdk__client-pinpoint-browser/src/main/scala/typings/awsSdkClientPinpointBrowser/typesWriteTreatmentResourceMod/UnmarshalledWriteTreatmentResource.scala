package typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod

import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledWriteTreatmentResource extends WriteTreatmentResource {
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledWriteTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledWriteTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.undefined
}

object UnmarshalledWriteTreatmentResource {
  @scala.inline
  def apply(
    MessageConfiguration: UnmarshalledMessageConfiguration = null,
    Schedule: UnmarshalledSchedule = null,
    SizePercent: js.UndefOr[Double] = js.undefined,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): UnmarshalledWriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(SizePercent)) __obj.updateDynamic("SizePercent")(SizePercent.get.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledWriteTreatmentResource]
  }
}

