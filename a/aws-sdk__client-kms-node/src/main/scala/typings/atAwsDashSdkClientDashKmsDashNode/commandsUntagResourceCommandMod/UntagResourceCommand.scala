package typings.atAwsDashSdkClientDashKmsDashNode.commandsUntagResourceCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUntagResourceInputMod.UntagResourceInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesUntagResourceOutputMod.UntagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/UntagResourceCommand", "UntagResourceCommand")
@js.native
class UntagResourceCommand protected () extends Command[
      InputTypesUnion, 
      UntagResourceInput, 
      OutputTypesUnion, 
      UntagResourceOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: UntagResourceInput) = this()
  /* CompleteClass */
  override val input: UntagResourceInput = js.native
  val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
}

