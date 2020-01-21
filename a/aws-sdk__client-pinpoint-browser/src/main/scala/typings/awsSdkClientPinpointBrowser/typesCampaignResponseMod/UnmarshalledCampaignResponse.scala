package typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.UnmarshalledTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCampaignResponse extends CampaignResponse {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments_UnmarshalledCampaignResponse: js.UndefOr[js.Array[UnmarshalledTreatmentResource]] = js.undefined
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  @JSName("DefaultState")
  var DefaultState_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignState] = js.undefined
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledSchedule] = js.undefined
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
    */
  @JSName("State")
  var State_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignState] = js.undefined
}

object UnmarshalledCampaignResponse {
  @scala.inline
  def apply(
    AdditionalTreatments: js.Array[UnmarshalledTreatmentResource] = null,
    ApplicationId: String = null,
    CreationDate: String = null,
    DefaultState: UnmarshalledCampaignState = null,
    Description: String = null,
    HoldoutPercent: Int | Double = null,
    Hook: UnmarshalledCampaignHook = null,
    Id: String = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    LastModifiedDate: String = null,
    Limits: UnmarshalledCampaignLimits = null,
    MessageConfiguration: UnmarshalledMessageConfiguration = null,
    Name: String = null,
    Schedule: UnmarshalledSchedule = null,
    SegmentId: String = null,
    SegmentVersion: Int | Double = null,
    State: UnmarshalledCampaignState = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null,
    Version: Int | Double = null
  ): UnmarshalledCampaignResponse = {
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
    __obj.asInstanceOf[UnmarshalledCampaignResponse]
  }
}

