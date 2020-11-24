package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobStatesToNotifyVarargs(value: JobState*): Self = this.set("JobStatesToNotify", js.Array(value :_*))
    
    @scala.inline
    def setJobStatesToNotify(value: JobStateList): Self = this.set("JobStatesToNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobStatesToNotify: Self = this.set("JobStatesToNotify", js.undefined)
    
    @scala.inline
    def setNotifyAll(value: Boolean): Self = this.set("NotifyAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyAll: Self = this.set("NotifyAll", js.undefined)
    
    @scala.inline
    def setSnsTopicARN(value: SnsTopicARN): Self = this.set("SnsTopicARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicARN: Self = this.set("SnsTopicARN", js.undefined)
  }
}
