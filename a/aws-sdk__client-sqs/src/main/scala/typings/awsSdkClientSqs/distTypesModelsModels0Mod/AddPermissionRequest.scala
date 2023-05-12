package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionRequest extends StObject {
  
  /**
    * <p>The Amazon Web Services account numbers of the <a href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principals</a> who are to receive
    *             permission. For information about locating the Amazon Web Services account identification, see <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication">Your Amazon Web Services Identifiers</a> in the <i>Amazon SQS Developer
    *             Guide</i>.</p>
    */
  var AWSAccountIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>The action the client wants to allow for the specified principal. Valid values: the name of any action or <code>*</code>.</p>
    *          <p>For more information about these actions, see <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html">Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a>
    *           in the <i>Amazon SQS Developer Guide</i>.</p>
    *          <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions: <code>SendMessageBatch</code>,
    *         <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.</p>
    */
  var Actions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The URL of the Amazon SQS queue to which permissions are added.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object AddPermissionRequest {
  
  inline def apply(): AddPermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setAWSAccountIds(value: js.Array[String]): Self = StObject.set(x, "AWSAccountIds", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdsUndefined: Self = StObject.set(x, "AWSAccountIds", js.undefined)
    
    inline def setAWSAccountIdsVarargs(value: String*): Self = StObject.set(x, "AWSAccountIds", js.Array(value*))
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
