package typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.WriteTreatmentResource
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteCampaignRequest extends js.Object {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[js.Array[WriteTreatmentResource] | Iterable[WriteTreatmentResource]] = js.undefined
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
  var Hook: js.UndefOr[CampaignHook] = js.undefined
  /**
    * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
    */
  var IsPaused: js.UndefOr[Boolean] = js.undefined
  /**
    * The campaign limits settings.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.undefined
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.undefined
  /**
    * The ID of the segment to which the campaign sends messages.
    */
  var SegmentId: js.UndefOr[String] = js.undefined
  /**
    * The version of the segment to which the campaign sends messages.
    */
  var SegmentVersion: js.UndefOr[Double] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.undefined
}

object WriteCampaignRequest {
  @scala.inline
  def apply(
    AdditionalTreatments: js.Array[WriteTreatmentResource] | Iterable[WriteTreatmentResource] = null,
    Description: String = null,
    HoldoutPercent: js.UndefOr[Double] = js.undefined,
    Hook: CampaignHook = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    Limits: CampaignLimits = null,
    MessageConfiguration: MessageConfiguration = null,
    Name: String = null,
    Schedule: Schedule = null,
    SegmentId: String = null,
    SegmentVersion: js.UndefOr[Double] = js.undefined,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(HoldoutPercent)) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.get.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused.get.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion.get.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCampaignRequest]
  }
}

