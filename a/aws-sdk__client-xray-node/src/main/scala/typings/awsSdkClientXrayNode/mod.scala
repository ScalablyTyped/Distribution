package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typings.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typings.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typings.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typings.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typings.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typings.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typings.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typings.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayConfiguration
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvableConfiguration
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.HttpOptions
import typings.awsSdkTypes.marshallerMod.RequestSerializer
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.DelayDecider
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryDecider
import typings.awsSdkTypes.utilMod.UrlParser
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BatchGetTracesCommand protected ()
    extends typings.awsSdkClientXrayNode.batchGetTracesCommandMod.BatchGetTracesCommand {
    def this(input: BatchGetTracesInput) = this()
  }
  
  @js.native
  class CreateSamplingRuleCommand protected ()
    extends typings.awsSdkClientXrayNode.createSamplingRuleCommandMod.CreateSamplingRuleCommand {
    def this(input: CreateSamplingRuleInput) = this()
  }
  
  @js.native
  class DeleteSamplingRuleCommand protected ()
    extends typings.awsSdkClientXrayNode.deleteSamplingRuleCommandMod.DeleteSamplingRuleCommand {
    def this(input: DeleteSamplingRuleInput) = this()
  }
  
  @js.native
  class GetEncryptionConfigCommand protected ()
    extends typings.awsSdkClientXrayNode.getEncryptionConfigCommandMod.GetEncryptionConfigCommand {
    def this(input: GetEncryptionConfigInput) = this()
  }
  
  @js.native
  class GetSamplingRulesCommand protected ()
    extends typings.awsSdkClientXrayNode.getSamplingRulesCommandMod.GetSamplingRulesCommand {
    def this(input: GetSamplingRulesInput) = this()
  }
  
  @js.native
  class GetSamplingStatisticSummariesCommand protected ()
    extends typings.awsSdkClientXrayNode.getSamplingStatisticSummariesCommandMod.GetSamplingStatisticSummariesCommand {
    def this(input: GetSamplingStatisticSummariesInput) = this()
  }
  
  @js.native
  class GetSamplingTargetsCommand protected ()
    extends typings.awsSdkClientXrayNode.getSamplingTargetsCommandMod.GetSamplingTargetsCommand {
    def this(input: GetSamplingTargetsInput) = this()
  }
  
  @js.native
  class GetServiceGraphCommand protected ()
    extends typings.awsSdkClientXrayNode.getServiceGraphCommandMod.GetServiceGraphCommand {
    def this(input: GetServiceGraphInput) = this()
  }
  
  @js.native
  class GetTraceGraphCommand protected ()
    extends typings.awsSdkClientXrayNode.getTraceGraphCommandMod.GetTraceGraphCommand {
    def this(input: GetTraceGraphInput) = this()
  }
  
  @js.native
  class GetTraceSummariesCommand protected ()
    extends typings.awsSdkClientXrayNode.getTraceSummariesCommandMod.GetTraceSummariesCommand {
    def this(input: GetTraceSummariesInput) = this()
  }
  
  @js.native
  class PutEncryptionConfigCommand protected ()
    extends typings.awsSdkClientXrayNode.putEncryptionConfigCommandMod.PutEncryptionConfigCommand {
    def this(input: PutEncryptionConfigInput) = this()
  }
  
  @js.native
  class PutTelemetryRecordsCommand protected ()
    extends typings.awsSdkClientXrayNode.putTelemetryRecordsCommandMod.PutTelemetryRecordsCommand {
    def this(input: PutTelemetryRecordsInput) = this()
  }
  
  @js.native
  class PutTraceSegmentsCommand protected ()
    extends typings.awsSdkClientXrayNode.putTraceSegmentsCommandMod.PutTraceSegmentsCommand {
    def this(input: PutTraceSegmentsInput) = this()
  }
  
  @js.native
  class UpdateSamplingRuleCommand protected ()
    extends typings.awsSdkClientXrayNode.updateSamplingRuleCommandMod.UpdateSamplingRuleCommand {
    def this(input: UpdateSamplingRuleInput) = this()
  }
  
  @js.native
  class XRay ()
    extends typings.awsSdkClientXrayNode.xrayMod.XRay
  
  @js.native
  class XRayClient protected ()
    extends typings.awsSdkClientXrayNode.xrayclientMod.XRayClient {
    def this(configuration: XRayConfiguration) = this()
  }
  
  @js.native
  object configurationProperties extends js.Object {
    val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val base64Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val base64Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val bodyLengthChecker: ConfigurationPropertyDefinition[
        js.Function1[/* body */ _, js.UndefOr[Double]], 
        js.Function1[/* body */ _, js.UndefOr[Double]], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val credentials: ConfigurationPropertyDefinition[
        js.UndefOr[Credentials | Provider[Credentials]], 
        Provider[Credentials], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val delayDecider: ConfigurationPropertyDefinition[
        js.UndefOr[DelayDecider], 
        js.UndefOr[DelayDecider], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val endpoint: ConfigurationPropertyDefinition[
        js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
        Provider[HttpEndpoint], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val handler: ConfigurationPropertyDefinition[
        js.UndefOr[Terminalware[_, Readable]], 
        Terminalware[_, Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val httpHandler: ConfigurationPropertyDefinition[
        js.UndefOr[HttpHandler[Readable, HttpOptions]], 
        HttpHandler[Readable, HttpOptions], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val maxRedirects: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val maxRetries: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val parser: ConfigurationPropertyDefinition[
        ResponseParser[Readable], 
        ResponseParser[Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val profile: ConfigurationPropertyDefinition[
        js.UndefOr[String], 
        js.UndefOr[String], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val region: ConfigurationPropertyDefinition[
        js.UndefOr[String | Provider[String]], 
        Provider[String], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val retryDecider: ConfigurationPropertyDefinition[
        js.UndefOr[RetryDecider], 
        js.UndefOr[RetryDecider], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val serializer: ConfigurationPropertyDefinition[
        Provider[RequestSerializer[Readable]], 
        Provider[RequestSerializer[Readable]], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val sha256: ConfigurationPropertyDefinition[
        js.UndefOr[HashConstructor], 
        HashConstructor, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val signer: ConfigurationPropertyDefinition[
        js.UndefOr[RequestSigner], 
        RequestSigner, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val signingName: ConfigurationPropertyDefinition[js.UndefOr[String], String, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val sslEnabled: ConfigurationPropertyDefinition[js.UndefOr[Boolean], Boolean, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val streamCollector: ConfigurationPropertyDefinition[
        js.UndefOr[StreamCollector[Readable]], 
        StreamCollector[Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val urlParser: ConfigurationPropertyDefinition[
        js.UndefOr[UrlParser], 
        UrlParser, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val utf8Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val utf8Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
  }
  
}

