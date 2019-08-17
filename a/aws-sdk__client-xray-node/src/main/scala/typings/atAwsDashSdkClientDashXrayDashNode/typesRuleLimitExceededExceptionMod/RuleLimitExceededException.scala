package typings.atAwsDashSdkClientDashXrayDashNode.typesRuleLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _RuleLimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.RuleLimitExceededException,
    stack: String = null
  ): RuleLimitExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RuleLimitExceededException]
  }
}

