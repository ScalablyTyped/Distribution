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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<XRayResolvableConfiguration, XRayResolvedConfiguration> */ js.Any = js.native
  
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
}
