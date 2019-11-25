package typings.atAwsDashSdkClientDashXrayDashNode.typesRuleLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleLimitExceededException
  extends ServiceException[_RuleLimitExceededExceptionDetails]
     with CreateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_RuleLimitExceededException: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.RuleLimitExceededException
}

object RuleLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RuleLimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.RuleLimitExceededException,
    stack: String = null
  ): RuleLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleLimitExceededException]
  }
}

