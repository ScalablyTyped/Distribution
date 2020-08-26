package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialFailure extends js.Object {
  /**
    * The type of error.
    */
  var ExceptionType: js.UndefOr[typings.awsSdk.cloudwatchMod.ExceptionType] = js.native
  /**
    * The code of the error.
    */
  var FailureCode: js.UndefOr[typings.awsSdk.cloudwatchMod.FailureCode] = js.native
  /**
    * A description of the error.
    */
  var FailureDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.FailureDescription] = js.native
  /**
    * The specified rule that could not be deleted.
    */
  var FailureResource: js.UndefOr[typings.awsSdk.cloudwatchMod.FailureResource] = js.native
}

object PartialFailure {
  @scala.inline
  def apply(): PartialFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFailure]
  }
  @scala.inline
  implicit class PartialFailureOps[Self <: PartialFailure] (val x: Self) extends AnyVal {
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
    def setExceptionType(value: ExceptionType): Self = this.set("ExceptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptionType: Self = this.set("ExceptionType", js.undefined)
    @scala.inline
    def setFailureCode(value: FailureCode): Self = this.set("FailureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("FailureCode", js.undefined)
    @scala.inline
    def setFailureDescription(value: FailureDescription): Self = this.set("FailureDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDescription: Self = this.set("FailureDescription", js.undefined)
    @scala.inline
    def setFailureResource(value: FailureResource): Self = this.set("FailureResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureResource: Self = this.set("FailureResource", js.undefined)
  }
  
}

