package typings.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod

import typings.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidGrantTokenException
  extends ServiceException[InvalidGrantTokenExceptionDetails]
     with CreateGrantExceptionsUnion
     with DecryptExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion
     with RetireGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantTokenException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantTokenException
}

object InvalidGrantTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidGrantTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantTokenException,
    stack: String = null
  ): InvalidGrantTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidGrantTokenException]
  }
}

