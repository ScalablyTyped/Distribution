package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionRequest extends StObject {
  
  /**
    * The Amazon Web Services account numbers of the principals who are to receive permission. For information about locating the Amazon Web Services account identification, see Your Amazon Web Services Identifiers in the Amazon SQS Developer Guide.
    */
  var AWSAccountIds: AWSAccountIdList
  
  /**
    * The action the client wants to allow for the specified principal. Valid values: the name of any action or *. For more information about these actions, see Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource in the Amazon SQS Developer Guide. Specifying SendMessage, DeleteMessage, or ChangeMessageVisibility for ActionName.n also grants permissions for the corresponding batch versions of those actions: SendMessageBatch, DeleteMessageBatch, and ChangeMessageVisibilityBatch.
    */
  var Actions: ActionNameList
  
  /**
    * The unique identification of the permission you're setting (for example, AliceSendMessage). Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (-), and underscores (_).
    */
  var Label: String
  
  /**
    * The URL of the Amazon SQS queue to which permissions are added. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}
object AddPermissionRequest {
  
  inline def apply(AWSAccountIds: AWSAccountIdList, Actions: ActionNameList, Label: String, QueueUrl: String): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setAWSAccountIds(value: AWSAccountIdList): Self = StObject.set(x, "AWSAccountIds", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdsVarargs(value: String*): Self = StObject.set(x, "AWSAccountIds", js.Array(value*))
    
    inline def setActions(value: ActionNameList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
