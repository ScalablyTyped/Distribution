package typings.atAwsDashSdkClientDashGlacierDashNode.commandsSetVaultAccessPolicyCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesSetVaultAccessPolicyOutputMod.SetVaultAccessPolicyOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetVaultAccessPolicyCommand", "SetVaultAccessPolicyCommand")
@js.native
class SetVaultAccessPolicyCommand protected () extends Command[
      InputTypesUnion, 
      SetVaultAccessPolicyInput, 
      OutputTypesUnion, 
      SetVaultAccessPolicyOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: SetVaultAccessPolicyInput) = this()
  /* CompleteClass */
  override val input: SetVaultAccessPolicyInput = js.native
  val middlewareStack: MiddlewareStack[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
}

