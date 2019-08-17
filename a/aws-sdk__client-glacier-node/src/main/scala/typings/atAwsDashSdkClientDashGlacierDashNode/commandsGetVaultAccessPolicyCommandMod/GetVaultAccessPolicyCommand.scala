package typings.atAwsDashSdkClientDashGlacierDashNode.commandsGetVaultAccessPolicyCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultAccessPolicyOutputMod.GetVaultAccessPolicyOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultAccessPolicyCommand", "GetVaultAccessPolicyCommand")
@js.native
class GetVaultAccessPolicyCommand protected () extends Command[
      InputTypesUnion, 
      GetVaultAccessPolicyInput, 
      OutputTypesUnion, 
      GetVaultAccessPolicyOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetVaultAccessPolicyInput) = this()
  /* CompleteClass */
  override val input: GetVaultAccessPolicyInput = js.native
  val middlewareStack: MiddlewareStack[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetVaultAccessPolicyInput, GetVaultAccessPolicyOutput] = js.native
}

