package typings.awsSdkClientKmsBrowser.typesInvalidKeyUsageExceptionMod

import typings.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidKeyUsageException
  extends ServiceException[InvalidKeyUsageExceptionDetails]
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidKeyUsageException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidKeyUsageException
}

object InvalidKeyUsageException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidKeyUsageExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidKeyUsageException,
    stack: String = null
  ): InvalidKeyUsageException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidKeyUsageException]
  }
}

