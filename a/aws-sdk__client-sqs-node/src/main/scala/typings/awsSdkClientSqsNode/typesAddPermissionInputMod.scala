package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddPermissionInputMod {
  
  trait AddPermissionInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The AWS account number of the <a href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about locating the AWS account identification, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication">Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    var AWSAccountIds: js.Array[String] | js.Iterable[String]
    
    /**
      * <p>The action the client wants to allow for the specified principal. Valid values: the name of any action or <code>*</code>.</p> <p>For more information about these actions, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html">Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.</p>
      */
    var Actions: js.Array[String] | js.Iterable[String]
    
    /**
      * <p>The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
      */
    var Label: String
    
    /**
      * <p>The URL of the Amazon SQS queue to which permissions are added.</p> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueUrl: String
  }
  object AddPermissionInput {
    
    inline def apply(
      AWSAccountIds: js.Array[String] | js.Iterable[String],
      Actions: js.Array[String] | js.Iterable[String],
      Label: String,
      QueueUrl: String
    ): AddPermissionInput = {
      val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPermissionInput]
    }
    
    extension [Self <: AddPermissionInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setAWSAccountIds(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "AWSAccountIds", value.asInstanceOf[js.Any])
      
      inline def setAWSAccountIdsVarargs(value: String*): Self = StObject.set(x, "AWSAccountIds", js.Array(value*))
      
      inline def setActions(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "Actions", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    }
  }
}
