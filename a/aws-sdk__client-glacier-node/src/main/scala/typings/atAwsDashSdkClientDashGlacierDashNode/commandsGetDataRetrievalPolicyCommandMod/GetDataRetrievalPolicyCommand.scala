package typings.atAwsDashSdkClientDashGlacierDashNode.commandsGetDataRetrievalPolicyCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetDataRetrievalPolicyCommand", "GetDataRetrievalPolicyCommand")
@js.native
class GetDataRetrievalPolicyCommand protected () extends Command[
      InputTypesUnion, 
      GetDataRetrievalPolicyInput, 
      OutputTypesUnion, 
      GetDataRetrievalPolicyOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetDataRetrievalPolicyInput) = this()
  /* CompleteClass */
  override val input: GetDataRetrievalPolicyInput = js.native
  val middlewareStack: MiddlewareStack[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
}

