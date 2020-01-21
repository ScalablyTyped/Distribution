package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreatmentResource extends js.Object {
  /**
    * The unique identifier for the treatment.
    */
  var Id: string = js.native
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The allocated percentage of users (segment members) that the treatment is sent to.
    */
  var SizePercent: integer = js.native
  /**
    * The current status of the treatment.
    */
  var State: js.UndefOr[CampaignState] = js.native
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * The custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * The custom name of the treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentName: js.UndefOr[string] = js.native
}

object TreatmentResource {
  @scala.inline
  def apply(
    Id: string,
    SizePercent: integer,
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    State: CampaignState = null,
    TemplateConfiguration: TemplateConfiguration = null,
    TreatmentDescription: string = null,
    TreatmentName: string = null
  ): TreatmentResource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], SizePercent = SizePercent.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TemplateConfiguration != null) __obj.updateDynamic("TemplateConfiguration")(TemplateConfiguration.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatmentResource]
  }
}

