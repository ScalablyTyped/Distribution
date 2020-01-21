package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typings.awsSdkClientGlacierNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AbortMultipartUploadCommand", JSImport.Namespace)
@js.native
object abortMultipartUploadCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  }
  
}

