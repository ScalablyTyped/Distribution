package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
import typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadOutputMod.InitiateMultipartUploadOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateMultipartUploadCommand", JSImport.Namespace)
@js.native
object initiateMultipartUploadCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
  }
  
}

