package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /**
    * The list of job states that will trigger a notification for this job.
    */
  var JobStatesToNotify: js.UndefOr[JobStateList] = js.native
  /**
    * Any change in job state will trigger a notification for this job.
    */
  var NotifyAll: js.UndefOr[Boolean] = js.native
  /**
    * The new SNS TopicArn that you want to associate with this job. You can create Amazon Resource Names (ARNs) for topics by using the CreateTopic Amazon SNS API action. You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the Subscribe AWS Simple Notification Service (SNS) API action.
    */
  var SnsTopicARN: js.UndefOr[typings.awsSdk.snowballMod.SnsTopicARN] = js.native
}

object Notification {
  @scala.inline
  def apply(
    JobStatesToNotify: JobStateList = null,
    NotifyAll: js.UndefOr[Boolean] = js.undefined,
    SnsTopicARN: SnsTopicARN = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (JobStatesToNotify != null) __obj.updateDynamic("JobStatesToNotify")(JobStatesToNotify.asInstanceOf[js.Any])
    if (!js.isUndefined(NotifyAll)) __obj.updateDynamic("NotifyAll")(NotifyAll.get.asInstanceOf[js.Any])
    if (SnsTopicARN != null) __obj.updateDynamic("SnsTopicARN")(SnsTopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

