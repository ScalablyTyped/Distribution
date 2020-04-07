package typings.awsSdkClientKmsNode.typesDisabledExceptionMod

import typings.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledException
  extends ServiceException[DisabledExceptionDetails]
     with CreateGrantExceptionsUnion
     with DecryptExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_DisabledException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException
}

object DisabledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DisabledExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException,
    stack: String = null
  ): DisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledException]
  }
}

