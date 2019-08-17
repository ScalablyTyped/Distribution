package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidCiphertextExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCiphertextException
  extends ServiceException[_InvalidCiphertextExceptionDetails]
     with DecryptExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidCiphertextException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidCiphertextException
}

object InvalidCiphertextException {
  @scala.inline
  def apply(
    details: _InvalidCiphertextExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidCiphertextException,
    stack: String = null
  ): InvalidCiphertextException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidCiphertextException]
  }
}

