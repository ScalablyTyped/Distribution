package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionRequest extends js.Object {
  /**
    * The identification of the permission to remove. This is the label added using the  AddPermission  action.
    */
  var Label: String = js.native
  /**
    * The URL of the Amazon SQS queue from which permissions are removed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object RemovePermissionRequest {
  @scala.inline
  def apply(Label: String, QueueUrl: String): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionRequest]
  }
  @scala.inline
  implicit class RemovePermissionRequestOps[Self <: RemovePermissionRequest] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
  }
  
}

