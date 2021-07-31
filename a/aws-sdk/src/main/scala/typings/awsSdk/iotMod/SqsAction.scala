package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqsAction extends StObject {
  
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: QueueUrl
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
  
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: js.UndefOr[UseBase64] = js.undefined
}
object SqsAction {
  
  @scala.inline
  def apply(queueUrl: QueueUrl, roleArn: AwsArn): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsAction]
  }
  
  @scala.inline
  implicit class SqsActionMutableBuilder[Self <: SqsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: QueueUrl): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBase64(value: UseBase64): Self = StObject.set(x, "useBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBase64Undefined: Self = StObject.set(x, "useBase64", js.undefined)
  }
}
