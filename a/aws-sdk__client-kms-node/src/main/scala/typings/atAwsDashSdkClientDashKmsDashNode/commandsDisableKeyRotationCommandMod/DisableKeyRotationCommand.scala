package typings.atAwsDashSdkClientDashKmsDashNode.commandsDisableKeyRotationCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DisableKeyRotationCommand", "DisableKeyRotationCommand")
@js.native
class DisableKeyRotationCommand protected () extends Command[
      InputTypesUnion, 
      DisableKeyRotationInput, 
      OutputTypesUnion, 
      DisableKeyRotationOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DisableKeyRotationInput) = this()
  /* CompleteClass */
  override val input: DisableKeyRotationInput = js.native
  val middlewareStack: MiddlewareStack[DisableKeyRotationInput, DisableKeyRotationOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
}

