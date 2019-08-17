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
    details: _InvalidRequestExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.InvalidRequestException,
    stack: String = null
  ): InvalidRequestException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidRequestException]
  }
}

