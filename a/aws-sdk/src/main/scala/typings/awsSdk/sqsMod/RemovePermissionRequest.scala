package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovePermissionRequest extends StObject {
  
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
  implicit class RemovePermissionRequestMutableBuilder[Self <: RemovePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
