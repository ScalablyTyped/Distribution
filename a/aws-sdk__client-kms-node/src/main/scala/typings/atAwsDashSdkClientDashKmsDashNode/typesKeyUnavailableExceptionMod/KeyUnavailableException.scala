package typings.atAwsDashSdkClientDashKmsDashNode.typesKeyUnavailableExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyUnavailableException
  extends ServiceException[_KeyUnavailableExceptionDetails]
     with DecryptExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_KeyUnavailableException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.KeyUnavailableException
}

object KeyUnavailableException {
  @scala.inline
  def apply(
    details: _KeyUnavailableExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.KeyUnavailableException,
    stack: String = null
  ): KeyUnavailableException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[KeyUnavailableException]
  }
}

