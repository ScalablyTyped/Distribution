package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteCampaignRequestMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._UnmarshalledCampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._UnmarshalledCampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod._UnmarshalledMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod._UnmarshalledSchedule
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteTreatmentResourceMod._UnmarshalledWriteTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledWriteCampaignRequest extends _WriteCampaignRequest {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments__UnmarshalledWriteCampaignRequest: js.UndefOr[js.Array[_UnmarshalledWriteTreatmentResource]] = js.undefined
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook__UnmarshalledWriteCampaignRequest: js.UndefOr[_UnmarshalledCampaignHook] = js.undefined
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits__UnmarshalledWriteCampaignRequest: js.UndefOr[_UnmarshalledCampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration__UnmarshalledWriteCampaignRequest: js.UndefOr[_UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule__UnmarshalledWriteCampaignRequest: js.UndefOr[_UnmarshalledSchedule] = js.undefined
}

object _UnmarshalledWriteCampaignRequest {
  @scala.inline
  def apply(
    AdditionalTreatments: js.Array[_UnmarshalledWriteTreatmentResource] = null,
    Description: String = null,
    HoldoutPercent: Int | Double = null,
    Hook: _UnmarshalledCampaignHook = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    Limits: _UnmarshalledCampaignLimits = null,
    MessageConfiguration: _UnmarshalledMessageConfiguration = null,
    Name: String = null,
    Schedule: _UnmarshalledSchedule = null,
    SegmentId: String = null,
    SegmentVersion: Int | Double = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): _UnmarshalledWriteCampaignRequest = {
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
    __obj.asInstanceOf[_UnmarshalledWriteCampaignRequest]
  }
}

