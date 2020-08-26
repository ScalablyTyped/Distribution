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
  def apply(SizePercent: integer): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal(SizePercent = SizePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTreatmentResource]
  }
  @scala.inline
  implicit class WriteTreatmentResourceOps[Self <: WriteTreatmentResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSizePercent(value: integer): Self = this.set("SizePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = this.set("CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDeliveryConfiguration: Self = this.set("CustomDeliveryConfiguration", js.undefined)
    @scala.inline
    def setMessageConfiguration(value: MessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = this.set("TemplateConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateConfiguration: Self = this.set("TemplateConfiguration", js.undefined)
    @scala.inline
    def setTreatmentDescription(value: string): Self = this.set("TreatmentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatmentDescription: Self = this.set("TreatmentDescription", js.undefined)
    @scala.inline
    def setTreatmentName(value: string): Self = this.set("TreatmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreatmentName: Self = this.set("TreatmentName", js.undefined)
  }
  
}

