package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typings.awsSdkClientGlacierNode.typesUploadArchiveOutputMod.UploadArchiveOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadArchiveCommand", JSImport.Namespace)
@js.native
object uploadArchiveCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
  }
  
}

