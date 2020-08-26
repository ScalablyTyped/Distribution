package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
    */
  var Completed: js.UndefOr[SnsTopic] = js.native
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
    */
  var Error: js.UndefOr[SnsTopic] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.
    */
  var Progressing: js.UndefOr[SnsTopic] = js.native
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
    */
  var Warning: js.UndefOr[SnsTopic] = js.native
}

object Notifications {
  @scala.inline
  def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  @scala.inline
  implicit class NotificationsOps[Self <: Notifications] (val x: Self) extends AnyVal {
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
    def setCompleted(value: SnsTopic): Self = this.set("Completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("Completed", js.undefined)
    @scala.inline
    def setError(value: SnsTopic): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setProgressing(value: SnsTopic): Self = this.set("Progressing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressing: Self = this.set("Progressing", js.undefined)
    @scala.inline
    def setWarning(value: SnsTopic): Self = this.set("Warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
  
}

