package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedS3Resource extends js.Object {
  /**
    * The status code of a failed item.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The error message of a failed item.
    */
  var errorMessage: js.UndefOr[ExceptionMessage] = js.native
  /**
    * The failed S3 resources.
    */
  var failedItem: js.UndefOr[S3Resource] = js.native
}

object FailedS3Resource {
  @scala.inline
  def apply(): FailedS3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedS3Resource]
  }
  @scala.inline
  implicit class FailedS3ResourceOps[Self <: FailedS3Resource] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: ErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ExceptionMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setFailedItem(value: S3Resource): Self = this.set("failedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedItem: Self = this.set("failedItem", js.undefined)
  }
  
}

