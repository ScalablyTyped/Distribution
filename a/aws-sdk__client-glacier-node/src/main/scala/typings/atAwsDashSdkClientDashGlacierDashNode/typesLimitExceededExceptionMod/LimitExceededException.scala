package typings.atAwsDashSdkClientDashGlacierDashNode.typesLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesAddTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesCreateVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesPurchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[_LimitExceededExceptionDetails]
     with AddTagsToVaultExceptionsUnion
     with CreateVaultExceptionsUnion
     with PurchaseProvisionedCapacityExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _LimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

