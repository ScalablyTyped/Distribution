package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadMultipartPartCommand", JSImport.Namespace)
@js.native
object commandsUploadMultipartPartCommandMod extends js.Object {
  @js.native
  class UploadMultipartPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadMultipartPartInput[Readable], 
          OutputTypesUnion, 
          UploadMultipartPartOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: UploadMultipartPartInput[Readable]) = this()
    /* CompleteClass */
    override val input: UploadMultipartPartInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[UploadMultipartPartInput[Readable], UploadMultipartPartOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
  }
  
}

