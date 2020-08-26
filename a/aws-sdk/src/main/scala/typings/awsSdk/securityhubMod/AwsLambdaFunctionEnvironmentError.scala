package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionEnvironmentError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[NonEmptyString] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionEnvironmentError {
  @scala.inline
  def apply(): AwsLambdaFunctionEnvironmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironmentError]
  }
  @scala.inline
  implicit class AwsLambdaFunctionEnvironmentErrorOps[Self <: AwsLambdaFunctionEnvironmentError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: NonEmptyString): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setMessage(value: NonEmptyString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

