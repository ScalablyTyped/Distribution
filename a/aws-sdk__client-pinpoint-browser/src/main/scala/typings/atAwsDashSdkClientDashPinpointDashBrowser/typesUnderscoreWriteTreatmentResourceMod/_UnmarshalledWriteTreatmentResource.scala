package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteTreatmentResourceMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod._UnmarshalledMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreScheduleMod._UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledWriteTreatmentResource extends _WriteTreatmentResource {
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration__UnmarshalledWriteTreatmentResource: js.UndefOr[_UnmarshalledMessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule__UnmarshalledWriteTreatmentResource: js.UndefOr[_UnmarshalledSchedule] = js.undefined
}

object _UnmarshalledWriteTreatmentResource {
  @scala.inline
  def apply(
    MessageConfiguration: _UnmarshalledMessageConfiguration = null,
    Schedule: _UnmarshalledSchedule = null,
    SizePercent: Int | Double = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): _UnmarshalledWriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SizePercent != null) __obj.updateDynamic("SizePercent")(SizePercent.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    __obj.asInstanceOf[_UnmarshalledWriteTreatmentResource]
  }
}

