package typings.awsSdkClientXrayNode.typesThrottledExceptionMod

import typings.awsSdkClientXrayNode.batchGetTracesExceptionsUnionMod.BatchGetTracesExceptionsUnion
import typings.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.awsSdkClientXrayNode.deleteSamplingRuleExceptionsUnionMod.DeleteSamplingRuleExceptionsUnion
import typings.awsSdkClientXrayNode.getEncryptionConfigExceptionsUnionMod.GetEncryptionConfigExceptionsUnion
import typings.awsSdkClientXrayNode.getSamplingRulesExceptionsUnionMod.GetSamplingRulesExceptionsUnion
import typings.awsSdkClientXrayNode.getSamplingStatisticSummariesExceptionsUnionMod.GetSamplingStatisticSummariesExceptionsUnion
import typings.awsSdkClientXrayNode.getSamplingTargetsExceptionsUnionMod.GetSamplingTargetsExceptionsUnion
import typings.awsSdkClientXrayNode.getServiceGraphExceptionsUnionMod.GetServiceGraphExceptionsUnion
import typings.awsSdkClientXrayNode.getTraceGraphExceptionsUnionMod.GetTraceGraphExceptionsUnion
import typings.awsSdkClientXrayNode.getTraceSummariesExceptionsUnionMod.GetTraceSummariesExceptionsUnion
import typings.awsSdkClientXrayNode.putEncryptionConfigExceptionsUnionMod.PutEncryptionConfigExceptionsUnion
import typings.awsSdkClientXrayNode.putTelemetryRecordsExceptionsUnionMod.PutTelemetryRecordsExceptionsUnion
import typings.awsSdkClientXrayNode.putTraceSegmentsExceptionsUnionMod.PutTraceSegmentsExceptionsUnion
import typings.awsSdkClientXrayNode.updateSamplingRuleExceptionsUnionMod.UpdateSamplingRuleExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottledException
  extends ServiceException[ThrottledExceptionDetails]
     with BatchGetTracesExceptionsUnion
     with CreateSamplingRuleExceptionsUnion
     with DeleteSamplingRuleExceptionsUnion
     with GetEncryptionConfigExceptionsUnion
     with GetSamplingRulesExceptionsUnion
     with GetSamplingStatisticSummariesExceptionsUnion
     with GetSamplingTargetsExceptionsUnion
     with GetServiceGraphExceptionsUnion
     with GetTraceGraphExceptionsUnion
     with GetTraceSummariesExceptionsUnion
     with PutEncryptionConfigExceptionsUnion
     with PutTelemetryRecordsExceptionsUnion
     with PutTraceSegmentsExceptionsUnion
     with UpdateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_ThrottledException: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException
}

object ThrottledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ThrottledExceptionDetails,
    message: String,
    name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException,
    stack: String = null
  ): ThrottledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottledException]
  }
}

