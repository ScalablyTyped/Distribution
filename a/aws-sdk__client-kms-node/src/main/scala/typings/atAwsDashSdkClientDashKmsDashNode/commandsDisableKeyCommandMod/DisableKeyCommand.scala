package typings.atAwsDashSdkClientDashKmsDashNode.commandsDisableKeyCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyInputMod.DisableKeyInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyOutputMod.DisableKeyOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DisableKeyCommand", "DisableKeyCommand")
@js.native
class DisableKeyCommand protected () extends Command[
      InputTypesUnion, 
      DisableKeyInput, 
      OutputTypesUnion, 
      DisableKeyOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DisableKeyInput) = this()
  /* CompleteClass */
  override val input: DisableKeyInput = js.native
  val middlewareStack: MiddlewareStack[DisableKeyInput, DisableKeyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
}

