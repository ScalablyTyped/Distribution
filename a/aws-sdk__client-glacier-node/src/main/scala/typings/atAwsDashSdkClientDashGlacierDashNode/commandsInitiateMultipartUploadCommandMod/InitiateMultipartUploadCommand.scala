package typings.atAwsDashSdkClientDashGlacierDashNode.commandsInitiateMultipartUploadCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateMultipartUploadOutputMod.InitiateMultipartUploadOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateMultipartUploadCommand", "InitiateMultipartUploadCommand")
@js.native
class InitiateMultipartUploadCommand protected () extends Command[
      InputTypesUnion, 
      InitiateMultipartUploadInput, 
      OutputTypesUnion, 
      InitiateMultipartUploadOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: InitiateMultipartUploadInput) = this()
  /* CompleteClass */
  override val input: InitiateMultipartUploadInput = js.native
  val middlewareStack: MiddlewareStack[InitiateMultipartUploadInput, InitiateMultipartUploadOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
}

