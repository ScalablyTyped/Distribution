package typings.atAwsDashSdkClientDashGlacierDashNode.commandsGetVaultNotificationsCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultNotificationsOutputMod.GetVaultNotificationsOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultNotificationsCommand", "GetVaultNotificationsCommand")
@js.native
class GetVaultNotificationsCommand protected () extends Command[
      InputTypesUnion, 
      GetVaultNotificationsInput, 
      OutputTypesUnion, 
      GetVaultNotificationsOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetVaultNotificationsInput) = this()
  /* CompleteClass */
  override val input: GetVaultNotificationsInput = js.native
  val middlewareStack: MiddlewareStack[GetVaultNotificationsInput, GetVaultNotificationsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
}

