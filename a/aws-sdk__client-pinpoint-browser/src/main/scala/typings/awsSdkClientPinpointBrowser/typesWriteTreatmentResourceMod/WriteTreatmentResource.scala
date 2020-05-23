package typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod

import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTreatmentResource extends js.Object {
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.undefined
  /**
    * The allocated percentage of users for this treatment.
    */
  var SizePercent: js.UndefOr[Double] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.undefined
}

object WriteTreatmentResource {
  @scala.inline
  def apply(
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    SizePercent: js.UndefOr[Double] = js.undefined,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(SizePercent)) __obj.updateDynamic("SizePercent")(SizePercent.get.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTreatmentResource]
  }
}

