package typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.UnmarshalledWriteTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledWriteCampaignRequest extends WriteCampaignRequest {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments_UnmarshalledWriteCampaignRequest: js.UndefOr[js.Array[UnmarshalledWriteTreatmentResource]] = js.undefined
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledSchedule] = js.undefined
}

object UnmarshalledWriteCampaignRequest {
  @scala.inline
  def apply(
    AdditionalTreatments: js.Array[UnmarshalledWriteTreatmentResource] = null,
    Description: String = null,
    HoldoutPercent: Int | Double = null,
    Hook: UnmarshalledCampaignHook = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    Limits: UnmarshalledCampaignLimits = null,
    MessageConfiguration: UnmarshalledMessageConfiguration = null,
    Name: String = null,
    Schedule: UnmarshalledSchedule = null,
    SegmentId: String = null,
    SegmentVersion: Int | Double = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): UnmarshalledWriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HoldoutPercent != null) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentVersion != null) __obj.updateDynamic("SegmentVersion")(SegmentVersion.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledWriteCampaignRequest]
  }
}

