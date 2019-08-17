package typings.atAwsDashSdkClientDashGlacierDashNode.commandsSetDataRetrievalPolicyCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetDataRetrievalPolicyCommand", "SetDataRetrievalPolicyCommand")
@js.native
class SetDataRetrievalPolicyCommand protected () extends Command[
      InputTypesUnion, 
      SetDataRetrievalPolicyInput, 
      OutputTypesUnion, 
      SetDataRetrievalPolicyOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: SetDataRetrievalPolicyInput) = this()
  /* CompleteClass */
  override val input: SetDataRetrievalPolicyInput = js.native
  val middlewareStack: MiddlewareStack[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
}

