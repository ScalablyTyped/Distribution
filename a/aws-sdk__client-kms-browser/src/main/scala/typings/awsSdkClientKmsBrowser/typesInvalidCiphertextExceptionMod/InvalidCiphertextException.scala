package typings.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod

import typings.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCiphertextException
  extends ServiceException[InvalidCiphertextExceptionDetails]
     with DecryptExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidCiphertextException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException
}

object InvalidCiphertextException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidCiphertextExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException,
    stack: String = null
  ): InvalidCiphertextException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCiphertextException]
  }
}

