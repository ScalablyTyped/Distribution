package typings.atAwsDashSdkClientDashKmsDashNode.typesUnsupportedOperationExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDeleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedOperationException
  extends ServiceException[_UnsupportedOperationExceptionDetails]
     with CreateKeyExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with PutKeyPolicyExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperationException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.UnsupportedOperationException
}

object UnsupportedOperationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _UnsupportedOperationExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.UnsupportedOperationException,
    stack: String = null
  ): UnsupportedOperationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperationException]
  }
}

