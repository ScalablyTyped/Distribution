package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDetails extends js.Object {
  /**
    * The path to the log file where the step failure root cause was originally recorded.
    */
  var LogFile: js.UndefOr[String] = js.native
  /**
    * The descriptive message including the error the EMR service has identified as the cause of step failure. This is text from an error log that describes the root cause of the failure.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The reason for the step failure. In the case where the service cannot successfully determine the root cause of the failure, it returns "Unknown Error" as a reason.
    */
  var Reason: js.UndefOr[String] = js.native
}

object FailureDetails {
  @scala.inline
  def apply(): FailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetails]
  }
  @scala.inline
  implicit class FailureDetailsOps[Self <: FailureDetails] (val x: Self) extends AnyVal {
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
    def setLogFile(value: String): Self = this.set("LogFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogFile: Self = this.set("LogFile", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
  
}

