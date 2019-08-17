package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreTreatmentResourceMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignStateMod._CampaignState
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod._MessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod._Schedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TreatmentResource extends js.Object {
  /**
    * The unique treatment ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[_MessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[_Schedule] = js.undefined
  /**
    * The allocated percentage of users for this treatment.
    */
  var SizePercent: js.UndefOr[Double] = js.undefined
  /**
    * The treatment status.
    */
  var State: js.UndefOr[_CampaignState] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.undefined
}

object _TreatmentResource {
  @scala.inline
  def apply(
    Id: String = null,
    MessageConfiguration: _MessageConfiguration = null,
    Schedule: _Schedule = null,
    SizePercent: Int | Double = null,
    State: _CampaignState = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): _TreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SizePercent != null) __obj.updateDynamic("SizePercent")(SizePercent.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    __obj.asInstanceOf[_TreatmentResource]
  }
}

