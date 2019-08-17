package typings.atAwsDashSdkClientDashGlacierDashNode.commandsUploadArchiveCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadArchiveInputMod.UploadArchiveInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadArchiveOutputMod.UploadArchiveOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadArchiveCommand", "UploadArchiveCommand")
@js.native
class UploadArchiveCommand protected () extends Command[
      InputTypesUnion, 
      UploadArchiveInput[Readable], 
      OutputTypesUnion, 
      UploadArchiveOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: UploadArchiveInput[Readable]) = this()
  /* CompleteClass */
  override val input: UploadArchiveInput[Readable] = js.native
  val middlewareStack: MiddlewareStack[UploadArchiveInput[Readable], UploadArchiveOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
}

