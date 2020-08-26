package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  /**
    * The name of the crawler to be used with this action.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  /**
    * The name of a job to be executed.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typings.awsSdk.glueMod.NotificationProperty] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this action.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typings.awsSdk.glueMod.Timeout] = js.native
}

object Action {
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def setArguments(value: GenericMap): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("Arguments", js.undefined)
    @scala.inline
    def setCrawlerName(value: NameString): Self = this.set("CrawlerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerName: Self = this.set("CrawlerName", js.undefined)
    @scala.inline
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setNotificationProperty(value: NotificationProperty): Self = this.set("NotificationProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationProperty: Self = this.set("NotificationProperty", js.undefined)
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = this.set("SecurityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("SecurityConfiguration", js.undefined)
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
  }
  
}

