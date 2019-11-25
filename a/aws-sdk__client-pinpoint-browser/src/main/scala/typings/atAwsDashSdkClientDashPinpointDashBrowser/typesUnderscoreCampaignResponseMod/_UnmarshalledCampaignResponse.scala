package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._UnmarshalledCampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._UnmarshalledCampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignStateMod._UnmarshalledCampaignState
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod._UnmarshalledMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod._UnmarshalledSchedule
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreTreatmentResourceMod._UnmarshalledTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCampaignResponse extends _CampaignResponse {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments__UnmarshalledCampaignResponse: js.UndefOr[js.Array[_UnmarshalledTreatmentResource]] = js.undefined
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  @JSName("DefaultState")
  var DefaultState__UnmarshalledCampaignResponse: js.UndefOr[_UnmarshalledCampaignState] = js.undefined
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook__UnmarshalledCampaignResponse: js.UndefOr[_UnmarshalledCampaignHook] = js.undefined
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits__UnmarshalledCampaignResponse: js.UndefOr[_UnmarshalledCampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration__UnmarshalledCampaignResponse: js.UndefOr[_UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule__UnmarshalledCampaignResponse: js.UndefOr[_UnmarshalledSchedule] = js.undefined
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
    */
  @JSName("State")
  var State__UnmarshalledCampaignResponse: js.UndefOr[_UnmarshalledCampaignState] = js.undefined
}

object _UnmarshalledCampaignResponse {
  @scala.inline
  def apply(
    AdditionalTreatments: js.Array[_UnmarshalledTreatmentResource] = null,
    ApplicationId: String = null,
    CreationDate: String = null,
    DefaultState: _UnmarshalledCampaignState = null,
    Description: String = null,
    HoldoutPercent: Int | Double = null,
    Hook: _UnmarshalledCampaignHook = null,
    Id: String = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    LastModifiedDate: String = null,
    Limits: _UnmarshalledCampaignLimits = null,
    MessageConfiguration: _UnmarshalledMessageConfiguration = null,
    Name: String = null,
    Schedule: _UnmarshalledSchedule = null,
    SegmentId: String = null,
    SegmentVersion: Int | Double = null,
    State: _UnmarshalledCampaignState = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null,
    Version: Int | Double = null
  ): _UnmarshalledCampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DefaultState != null) __obj.updateDynamic("DefaultState")(DefaultState.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HoldoutPercent != null) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentVersion != null) __obj.updateDynamic("SegmentVersion")(SegmentVersion.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledCampaignResponse]
  }
}

