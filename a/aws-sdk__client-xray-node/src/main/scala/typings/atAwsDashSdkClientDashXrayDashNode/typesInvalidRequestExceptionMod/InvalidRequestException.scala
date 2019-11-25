package typings.atAwsDashSdkClientDashXrayDashNode.typesInvalidRequestExceptionMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesBatchGetTracesExceptionsUnionMod.BatchGetTracesExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesDeleteSamplingRuleExceptionsUnionMod.DeleteSamplingRuleExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetEncryptionConfigExceptionsUnionMod.GetEncryptionConfigExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingRulesExceptionsUnionMod.GetSamplingRulesExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingStatisticSummariesExceptionsUnionMod.GetSamplingStatisticSummariesExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingTargetsExceptionsUnionMod.GetSamplingTargetsExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphExceptionsUnionMod.GetServiceGraphExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceGraphExceptionsUnionMod.GetTraceGraphExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceSummariesExceptionsUnionMod.GetTraceSummariesExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigExceptionsUnionMod.PutEncryptionConfigExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTelemetryRecordsExceptionsUnionMod.PutTelemetryRecordsExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTraceSegmentsExceptionsUnionMod.PutTraceSegmentsExceptionsUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUpdateSamplingRuleExceptionsUnionMod.UpdateSamplingRuleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRequestException
  extends ServiceException[_InvalidRequestExceptionDetails]
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
  var name_InvalidRequestException: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.InvalidRequestException
}

object InvalidRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRequestExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.InvalidRequestException,
    stack: String = null
  ): InvalidRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRequestException]
  }
}

