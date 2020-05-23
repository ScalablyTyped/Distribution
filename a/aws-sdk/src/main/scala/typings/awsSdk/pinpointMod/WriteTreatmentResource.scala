package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteTreatmentResource extends js.Object {
  /**
    * The delivery configuration settings for sending the treatment through a custom channel. This object is required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.native
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The allocated percentage of users (segment members) to send the treatment to.
    */
  var SizePercent: integer = js.native
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * A custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * A custom name for the treatment.
    */
  var TreatmentName: js.UndefOr[string] = js.native
}

object WriteTreatmentResource {
  @scala.inline
  def apply(
    SizePercent: integer,
    CustomDeliveryConfiguration: CustomDeliveryConfiguration = null,
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    TemplateConfiguration: TemplateConfiguration = null,
    TreatmentDescription: string = null,
    TreatmentName: string = null
  ): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal(SizePercent = SizePercent.asInstanceOf[js.Any])
    if (CustomDeliveryConfiguration != null) __obj.updateDynamic("CustomDeliveryConfiguration")(CustomDeliveryConfiguration.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (TemplateConfiguration != null) __obj.updateDynamic("TemplateConfiguration")(TemplateConfiguration.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTreatmentResource]
  }
}

