package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /**
    * The settings for a custom message activity. This type of activity calls an AWS Lambda function or web hook that sends messages to participants.
    */
  var CUSTOM: js.UndefOr[CustomMessageActivity] = js.native
  /**
    * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.
    */
  var ConditionalSplit: js.UndefOr[ConditionalSplitActivity] = js.native
  /**
    * The custom description of the activity.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The settings for an email activity. This type of activity sends an email message to participants.
    */
  var EMAIL: js.UndefOr[EmailMessageActivity] = js.native
  /**
    * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of participants.
    */
  var Holdout: js.UndefOr[HoldoutActivity] = js.native
  /**
    * The settings for a multivariate split activity. This type of activity sends participants down one of as many as five paths (including a default Else path) in a journey, based on conditions that you specify.
    */
  var MultiCondition: js.UndefOr[MultiConditionalSplitActivity] = js.native
  /**
    * The settings for a push notification activity. This type of activity sends a push notification to participants.
    */
  var PUSH: js.UndefOr[PushMessageActivity] = js.native
  /**
    * The settings for a random split activity. This type of activity randomly sends specified percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.
    */
  var RandomSplit: js.UndefOr[RandomSplitActivity] = js.native
  /**
    * The settings for an SMS activity. This type of activity sends a text message to participants.
    */
  var SMS: js.UndefOr[SMSMessageActivity] = js.native
  /**
    * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.
    */
  var Wait: js.UndefOr[WaitActivity] = js.native
}

object Activity {
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
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
    def setCUSTOM(value: CustomMessageActivity): Self = this.set("CUSTOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCUSTOM: Self = this.set("CUSTOM", js.undefined)
    @scala.inline
    def setConditionalSplit(value: ConditionalSplitActivity): Self = this.set("ConditionalSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalSplit: Self = this.set("ConditionalSplit", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEMAIL(value: EmailMessageActivity): Self = this.set("EMAIL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEMAIL: Self = this.set("EMAIL", js.undefined)
    @scala.inline
    def setHoldout(value: HoldoutActivity): Self = this.set("Holdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoldout: Self = this.set("Holdout", js.undefined)
    @scala.inline
    def setMultiCondition(value: MultiConditionalSplitActivity): Self = this.set("MultiCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiCondition: Self = this.set("MultiCondition", js.undefined)
    @scala.inline
    def setPUSH(value: PushMessageActivity): Self = this.set("PUSH", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePUSH: Self = this.set("PUSH", js.undefined)
    @scala.inline
    def setRandomSplit(value: RandomSplitActivity): Self = this.set("RandomSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomSplit: Self = this.set("RandomSplit", js.undefined)
    @scala.inline
    def setSMS(value: SMSMessageActivity): Self = this.set("SMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSMS: Self = this.set("SMS", js.undefined)
    @scala.inline
    def setWait(value: WaitActivity): Self = this.set("Wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("Wait", js.undefined)
  }
  
}

