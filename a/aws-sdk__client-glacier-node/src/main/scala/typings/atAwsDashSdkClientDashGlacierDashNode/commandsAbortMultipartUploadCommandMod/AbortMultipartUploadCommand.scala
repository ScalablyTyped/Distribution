package typings.atAwsDashSdkClientDashGlacierDashNode.commandsAbortMultipartUploadCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AbortMultipartUploadCommand", "AbortMultipartUploadCommand")
@js.native
class AbortMultipartUploadCommand protected () extends Command[
      InputTypesUnion, 
      AbortMultipartUploadInput, 
      OutputTypesUnion, 
      AbortMultipartUploadOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: AbortMultipartUploadInput) = this()
  /* CompleteClass */
  override val input: AbortMultipartUploadInput = js.native
  val middlewareStack: MiddlewareStack[AbortMultipartUploadInput, AbortMultipartUploadOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
}

