package typings.atAwsDashSdkClientDashGlacierDashNode.commandsCompleteMultipartUploadCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/CompleteMultipartUploadCommand", "CompleteMultipartUploadCommand")
@js.native
class CompleteMultipartUploadCommand protected () extends Command[
      InputTypesUnion, 
      CompleteMultipartUploadInput, 
      OutputTypesUnion, 
      CompleteMultipartUploadOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: CompleteMultipartUploadInput) = this()
  /* CompleteClass */
  override val input: CompleteMultipartUploadInput = js.native
  val middlewareStack: MiddlewareStack[CompleteMultipartUploadInput, CompleteMultipartUploadOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
}

