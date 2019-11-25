package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreTreatmentResourceMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignStateMod._UnmarshalledCampaignState
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod._UnmarshalledMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod._UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTreatmentResource extends _TreatmentResource {
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration__UnmarshalledTreatmentResource: js.UndefOr[_UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule__UnmarshalledTreatmentResource: js.UndefOr[_UnmarshalledSchedule] = js.undefined
  /**
    * The treatment status.
    */
  @JSName("State")
  var State__UnmarshalledTreatmentResource: js.UndefOr[_UnmarshalledCampaignState] = js.undefined
}

object _UnmarshalledTreatmentResource {
  @scala.inline
  def apply(
    Id: String = null,
    MessageConfiguration: _UnmarshalledMessageConfiguration = null,
    Schedule: _UnmarshalledSchedule = null,
    SizePercent: Int | Double = null,
    State: _UnmarshalledCampaignState = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): _UnmarshalledTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SizePercent != null) __obj.updateDynamic("SizePercent")(SizePercent.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTreatmentResource]
  }
}

