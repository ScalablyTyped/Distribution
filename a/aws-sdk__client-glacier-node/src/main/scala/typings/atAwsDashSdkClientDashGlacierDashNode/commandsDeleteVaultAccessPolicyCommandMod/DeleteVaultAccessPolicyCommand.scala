package typings.atAwsDashSdkClientDashGlacierDashNode.commandsDeleteVaultAccessPolicyCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultAccessPolicyCommand", "DeleteVaultAccessPolicyCommand")
@js.native
class DeleteVaultAccessPolicyCommand protected () extends Command[
      InputTypesUnion, 
      DeleteVaultAccessPolicyInput, 
      OutputTypesUnion, 
      DeleteVaultAccessPolicyOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteVaultAccessPolicyInput) = this()
  /* CompleteClass */
  override val input: DeleteVaultAccessPolicyInput = js.native
  val middlewareStack: MiddlewareStack[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
}

