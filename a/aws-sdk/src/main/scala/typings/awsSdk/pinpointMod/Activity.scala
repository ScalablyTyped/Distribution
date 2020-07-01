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
  def apply(
    CUSTOM: CustomMessageActivity = null,
    ConditionalSplit: ConditionalSplitActivity = null,
    Description: string = null,
    EMAIL: EmailMessageActivity = null,
    Holdout: HoldoutActivity = null,
    MultiCondition: MultiConditionalSplitActivity = null,
    PUSH: PushMessageActivity = null,
    RandomSplit: RandomSplitActivity = null,
    SMS: SMSMessageActivity = null,
    Wait: WaitActivity = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (CUSTOM != null) __obj.updateDynamic("CUSTOM")(CUSTOM.asInstanceOf[js.Any])
    if (ConditionalSplit != null) __obj.updateDynamic("ConditionalSplit")(ConditionalSplit.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EMAIL != null) __obj.updateDynamic("EMAIL")(EMAIL.asInstanceOf[js.Any])
    if (Holdout != null) __obj.updateDynamic("Holdout")(Holdout.asInstanceOf[js.Any])
    if (MultiCondition != null) __obj.updateDynamic("MultiCondition")(MultiCondition.asInstanceOf[js.Any])
    if (PUSH != null) __obj.updateDynamic("PUSH")(PUSH.asInstanceOf[js.Any])
    if (RandomSplit != null) __obj.updateDynamic("RandomSplit")(RandomSplit.asInstanceOf[js.Any])
    if (SMS != null) __obj.updateDynamic("SMS")(SMS.asInstanceOf[js.Any])
    if (Wait != null) __obj.updateDynamic("Wait")(Wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

