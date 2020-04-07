package typings.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod

import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedOperationException
  extends ServiceException[UnsupportedOperationExceptionDetails]
     with CreateKeyExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with PutKeyPolicyExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperationException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException
}

object UnsupportedOperationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: UnsupportedOperationExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException,
    stack: String = null
  ): UnsupportedOperationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperationException]
  }
}

