package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typings.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadMultipartPartCommand", JSImport.Namespace)
@js.native
object uploadMultipartPartCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
  }
  
}

