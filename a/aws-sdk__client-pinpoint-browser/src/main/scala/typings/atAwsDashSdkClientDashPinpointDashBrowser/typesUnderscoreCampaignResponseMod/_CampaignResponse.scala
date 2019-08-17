package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._CampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._CampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignStateMod._CampaignState
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod._MessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod._Schedule
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreTreatmentResourceMod._TreatmentResource
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CampaignResponse extends js.Object {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[js.Array[_TreatmentResource] | Iterable[_TreatmentResource]] = js.undefined
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The date the campaign was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  var DefaultState: js.UndefOr[_CampaignState] = js.undefined
  /**
    * A description of the campaign.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The allocated percentage of end users who will not receive messages from this campaign.
    */
  var HoldoutPercent: js.UndefOr[Double] = js.undefined
  /**
    * Campaign hook information.
    */
  var Hook: js.UndefOr[_CampaignHook] = js.undefined
  /**
    * The unique campaign ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
    */
  var IsPaused: js.UndefOr[Boolean] = js.undefined
  /**
    * The date the campaign was last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * The campaign limits settings.
    */
  var Limits: js.UndefOr[_CampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[_MessageConfiguration] = js.undefined
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[_Schedule] = js.undefined
  /**
    * The ID of the segment to which the campaign sends messages.
    */
  var SegmentId: js.UndefOr[String] = js.undefined
  /**
    * The version of the segment to which the campaign sends messages.
    */
  var SegmentVersion: js.UndefOr[Double] = js.undefined
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
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
  /**
    * The campaign version number.
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object _CampaignResponse {
  @scala.inline
  def apply(
    AdditionalTreatments: js.Array[_TreatmentResource] | Iterable[_TreatmentResource] = null,
    ApplicationId: String = null,
    CreationDate: String = null,
    DefaultState: _CampaignState = null,
    Description: String = null,
    HoldoutPercent: Int | Double = null,
    Hook: _CampaignHook = null,
    Id: String = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    LastModifiedDate: String = null,
    Limits: _CampaignLimits = null,
    MessageConfiguration: _MessageConfiguration = null,
    Name: String = null,
    Schedule: _Schedule = null,
    SegmentId: String = null,
    SegmentVersion: Int | Double = null,
    State: _CampaignState = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null,
    Version: Int | Double = null
  ): _CampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (DefaultState != null) __obj.updateDynamic("DefaultState")(DefaultState)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HoldoutPercent != null) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (SegmentVersion != null) __obj.updateDynamic("SegmentVersion")(SegmentVersion.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CampaignResponse]
  }
}

