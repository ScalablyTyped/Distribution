package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidArnExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDeleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDescribeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesScheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUpdateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidArnException
  extends ServiceException[_InvalidArnExceptionDetails]
     with CancelKeyDeletionExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DescribeKeyExceptionsUnion
     with DisableKeyExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with GetKeyPolicyExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeyPoliciesExceptionsUnion
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion
     with ScheduleKeyDeletionExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateKeyDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidArnException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidArnException
}

object InvalidArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidArnExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidArnException,
    stack: String = null
  ): InvalidArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidArnException]
  }
}

