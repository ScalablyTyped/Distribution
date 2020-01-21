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
}

