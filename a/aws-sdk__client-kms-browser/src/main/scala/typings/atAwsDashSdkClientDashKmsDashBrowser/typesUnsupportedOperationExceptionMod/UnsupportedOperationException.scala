package typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnsupportedOperationExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDeleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGetKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGetParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
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
  var name_UnsupportedOperationException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.UnsupportedOperationException
}

object UnsupportedOperationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _UnsupportedOperationExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.UnsupportedOperationException,
    stack: String = null
  ): UnsupportedOperationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperationException]
  }
}

