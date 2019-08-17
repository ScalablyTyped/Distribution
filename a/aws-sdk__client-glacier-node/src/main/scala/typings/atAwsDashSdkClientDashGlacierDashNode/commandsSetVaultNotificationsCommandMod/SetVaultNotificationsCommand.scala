package typings.atAwsDashSdkClientDashGlacierDashNode.commandsSetVaultNotificationsCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetVaultNotificationsCommand", "SetVaultNotificationsCommand")
@js.native
class SetVaultNotificationsCommand protected () extends Command[
      InputTypesUnion, 
      SetVaultNotificationsInput, 
      OutputTypesUnion, 
      SetVaultNotificationsOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: SetVaultNotificationsInput) = this()
  /* CompleteClass */
  override val input: SetVaultNotificationsInput = js.native
  val middlewareStack: MiddlewareStack[SetVaultNotificationsInput, SetVaultNotificationsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
}

