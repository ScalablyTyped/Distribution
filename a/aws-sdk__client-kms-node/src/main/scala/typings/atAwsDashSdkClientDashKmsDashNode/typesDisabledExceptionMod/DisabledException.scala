package typings.atAwsDashSdkClientDashKmsDashNode.typesDisabledExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledException
  extends ServiceException[_DisabledExceptionDetails]
     with CreateGrantExceptionsUnion
     with DecryptExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_DisabledException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.DisabledException
}

object DisabledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _DisabledExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.DisabledException,
    stack: String = null
  ): DisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledException]
  }
}

