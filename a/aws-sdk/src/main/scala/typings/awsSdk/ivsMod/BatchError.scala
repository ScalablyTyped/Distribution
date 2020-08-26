package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchError extends js.Object {
  /**
    * Channel ARN.
    */
  var arn: js.UndefOr[ResourceArn] = js.native
  /**
    * Error code.
    */
  var code: js.UndefOr[errorCode] = js.native
  /**
    * Error message, determined by the application.
    */
  var message: js.UndefOr[errorMessage] = js.native
}

object BatchError {
  @scala.inline
  def apply(): BatchError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchError]
  }
  @scala.inline
  implicit class BatchErrorOps[Self <: BatchError] (val x: Self) extends AnyVal {
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
    def setArn(value: ResourceArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCode(value: errorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMessage(value: errorMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

