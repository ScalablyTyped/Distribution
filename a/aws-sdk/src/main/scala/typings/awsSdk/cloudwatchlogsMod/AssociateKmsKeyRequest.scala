package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateKmsKeyRequest extends js.Object {
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
}

