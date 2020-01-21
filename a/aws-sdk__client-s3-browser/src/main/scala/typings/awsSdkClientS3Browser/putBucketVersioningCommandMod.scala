package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketVersioningCommand", JSImport.Namespace)
@js.native
object putBucketVersioningCommandMod extends js.Object {
  @js.native
  class PutBucketVersioningCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketVersioningInput, 
          OutputTypesUnion, 
          PutBucketVersioningOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketVersioningInput) = this()
    /* CompleteClass */
    override val input: PutBucketVersioningInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketVersioningInput, PutBucketVersioningOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
  }
  
}

