package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateKmsKeyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. This must be a symmetric CMK. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS) and Using Symmetric and Asymmetric Keys.
    */
  var kmsKeyId: KmsKeyId = js.native
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}
object AssociateKmsKeyRequest {
  
  @scala.inline
  def apply(kmsKeyId: KmsKeyId, logGroupName: LogGroupName): AssociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateKmsKeyRequest]
  }
  
  @scala.inline
  implicit class AssociateKmsKeyRequestMutableBuilder[Self <: AssociateKmsKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
