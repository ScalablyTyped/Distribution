package typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod

import typings.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.createVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.purchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with AddTagsToVaultExceptionsUnion
     with CreateVaultExceptionsUnion
     with PurchaseProvisionedCapacityExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

