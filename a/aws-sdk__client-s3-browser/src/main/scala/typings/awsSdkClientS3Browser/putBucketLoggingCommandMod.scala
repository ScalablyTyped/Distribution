package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput
import typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketLoggingCommand", JSImport.Namespace)
@js.native
object putBucketLoggingCommandMod extends js.Object {
  @js.native
  class PutBucketLoggingCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLoggingInput, 
          OutputTypesUnion, 
          PutBucketLoggingOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketLoggingInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketLoggingInput, PutBucketLoggingOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
  }
  
}

