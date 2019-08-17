package typings.atAwsDashSdkClientDashGlacierDashNode.typesLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesAddTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesCreateVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesPurchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _LimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[LimitExceededException]
  }
}

