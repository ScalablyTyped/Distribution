package typings.atAwsDashSdkClientDashXrayDashNode.typesRuleLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleLimitExceededException
  extends ServiceException[_RuleLimitExceededExceptionDetails]
     with CreateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_RuleLimitExceededException: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.RuleLimitExceededException = js.native
}

