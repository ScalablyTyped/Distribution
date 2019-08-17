package typings.atAwsDashSdkClientDashXrayDashNode.xRayMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesCreateSamplingRuleOutputMod.CreateSamplingRuleOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetEncryptionConfigOutputMod.GetEncryptionConfigOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingRulesOutputMod.GetSamplingRulesOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingStatisticSummariesOutputMod.GetSamplingStatisticSummariesOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingTargetsOutputMod.GetSamplingTargetsOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceGraphOutputMod.GetTraceGraphOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceSummariesOutputMod.GetTraceSummariesOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTelemetryRecordsOutputMod.PutTelemetryRecordsOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typings.atAwsDashSdkClientDashXrayDashNode.xRayClientMod.XRayClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/XRay", "XRay")
@js.native
class XRay () extends XRayClient {
  /**
    * <p>Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use <code>GetTraceSummaries</code> to get a list of trace IDs.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def batchGetTraces(args: BatchGetTracesInput): js.Promise[BatchGetTracesOutput] = js.native
  def batchGetTraces(
    args: BatchGetTracesInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[BatchGetTracesOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with <a>GetSamplingRules</a>, and evaluate each rule in ascending order of <i>priority</i> for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with <a>GetSamplingTargets</a> to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {RuleLimitExceededException} <p>You have reached the maximum number of sampling rules.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def createSamplingRule(args: CreateSamplingRuleInput): js.Promise[CreateSamplingRuleOutput] = js.native
  def createSamplingRule(
    args: CreateSamplingRuleInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[CreateSamplingRuleOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Deletes a sampling rule.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def deleteSamplingRule(args: DeleteSamplingRuleInput): js.Promise[DeleteSamplingRuleOutput] = js.native
  def deleteSamplingRule(
    args: DeleteSamplingRuleInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteSamplingRuleOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Retrieves the current encryption configuration for X-Ray data.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getEncryptionConfig(args: GetEncryptionConfigInput): js.Promise[GetEncryptionConfigOutput] = js.native
  def getEncryptionConfig(
    args: GetEncryptionConfigInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetEncryptionConfigOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Retrieves all sampling rules.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getSamplingRules(args: GetSamplingRulesInput): js.Promise[GetSamplingRulesOutput] = js.native
  def getSamplingRules(
    args: GetSamplingRulesInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetSamplingRulesOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Retrieves information about recent sampling results for all sampling rules.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getSamplingStatisticSummaries(args: GetSamplingStatisticSummariesInput): js.Promise[GetSamplingStatisticSummariesOutput] = js.native
  def getSamplingStatisticSummaries(
    args: GetSamplingStatisticSummariesInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetSamplingStatisticSummariesOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Requests a sampling quota for rules that the service is using to sample requests. </p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getSamplingTargets(args: GetSamplingTargetsInput): js.Promise[GetSamplingTargetsOutput] = js.native
  def getSamplingTargets(
    args: GetSamplingTargetsInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetSamplingTargetsOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getServiceGraph(args: GetServiceGraphInput): js.Promise[GetServiceGraphOutput] = js.native
  def getServiceGraph(
    args: GetServiceGraphInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetServiceGraphOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Retrieves a service graph for one or more specific trace IDs.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getTraceGraph(args: GetTraceGraphInput): js.Promise[GetTraceGraphOutput] = js.native
  def getTraceGraph(
    args: GetTraceGraphInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetTraceGraphOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to <code>BatchGetTraces</code>.</p> <p>A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through <code>api.example.com</code>:</p> <p> <code>service("api.example.com")</code> </p> <p>This filter expression finds traces that have an annotation named <code>account</code> with the value <code>12345</code>:</p> <p> <code>annotation.account = "12345"</code> </p> <p>For a full list of indexed fields and keywords that you can use in filter expressions, see <a href="http://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html">Using Filter Expressions</a> in the <i>AWS X-Ray Developer Guide</i>.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def getTraceSummaries(args: GetTraceSummariesInput): js.Promise[GetTraceSummariesOutput] = js.native
  def getTraceSummaries(
    args: GetTraceSummariesInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetTraceSummariesOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Updates the encryption configuration for X-Ray data.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def putEncryptionConfig(args: PutEncryptionConfigInput): js.Promise[PutEncryptionConfigOutput] = js.native
  def putEncryptionConfig(
    args: PutEncryptionConfigInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutEncryptionConfigOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Used by the AWS X-Ray daemon to upload telemetry.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def putTelemetryRecords(args: PutTelemetryRecordsInput): js.Promise[PutTelemetryRecordsOutput] = js.native
  def putTelemetryRecords(
    args: PutTelemetryRecordsInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutTelemetryRecordsOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments.</p> <p>Segments must include the following fields. For the full segment document schema, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">AWS X-Ray Segment Documents</a> in the <i>AWS X-Ray Developer Guide</i>.</p> <p class="title"> <b>Required Segment Document Fields</b> </p> <ul> <li> <p> <code>name</code> - The name of the service that handled the request.</p> </li> <li> <p> <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.</p> </li> <li> <p> <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single client request.</p> </li> <li> <p> <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.</p> </li> <li> <p> <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.</p> </li> <li> <p> <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.</p> </li> </ul> <p>A <code>trace_id</code> consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:</p> <p class="title"> <b>Trace ID Format</b> </p> <ul> <li> <p>The version number, i.e. <code>1</code>.</p> </li> <li> <p>The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.</p> </li> <li> <p>A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.</p> </li> </ul>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def putTraceSegments(args: PutTraceSegmentsInput): js.Promise[PutTraceSegmentsOutput] = js.native
  def putTraceSegments(
    args: PutTraceSegmentsInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutTraceSegmentsOutput], Unit]
  ): Unit = js.native
  /**
    * <p>Modifies a sampling rule's configuration.</p>
    *
    * This operation may fail with one of the following errors:
    *   - {InvalidRequestException} <p>The request is missing required parameters or has invalid parameters.</p>
    *   - {ThrottledException} <p>The request exceeds the maximum number of requests per second.</p>
    *   - {Error} An error originating from the SDK or customizations rather than the service
    */
  def updateSamplingRule(args: UpdateSamplingRuleInput): js.Promise[UpdateSamplingRuleOutput] = js.native
  def updateSamplingRule(
    args: UpdateSamplingRuleInput,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[UpdateSamplingRuleOutput], Unit]
  ): Unit = js.native
}

