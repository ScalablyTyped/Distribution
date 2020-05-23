package typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod

import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTreatmentResource extends TreatmentResource {
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.undefined
  /**
    * The treatment status.
    */
  @JSName("State")
  var State_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledCampaignState] = js.undefined
}

object UnmarshalledTreatmentResource {
  @scala.inline
  def apply(
    Id: String = null,
    MessageConfiguration: UnmarshalledMessageConfiguration = null,
    Schedule: UnmarshalledSchedule = null,
    SizePercent: js.UndefOr[Double] = js.undefined,
    State: UnmarshalledCampaignState = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): UnmarshalledTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(SizePercent)) __obj.updateDynamic("SizePercent")(SizePercent.get.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTreatmentResource]
  }
}

