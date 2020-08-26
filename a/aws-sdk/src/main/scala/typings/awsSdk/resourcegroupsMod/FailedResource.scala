package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedResource extends js.Object {
  /**
    * The error code associated with the failure.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.resourcegroupsMod.ErrorCode] = js.native
  /**
    * The error message text associated with the failure.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.resourcegroupsMod.ErrorMessage] = js.native
  /**
    * The ARN of the resource that failed to be added or removed.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceArn] = js.native
}

object FailedResource {
  @scala.inline
  def apply(): FailedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedResource]
  }
  @scala.inline
  implicit class FailedResourceOps[Self <: FailedResource] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
  }
  
}

