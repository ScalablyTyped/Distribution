package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
import typings.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketLifecycleCommand", JSImport.Namespace)
@js.native
object putBucketLifecycleCommandMod extends js.Object {
  @js.native
  class PutBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLifecycleInput, 
          OutputTypesUnion, 
          PutBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketLifecycleInput) = this()
    /* CompleteClass */
    override val input: PutBucketLifecycleInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketLifecycleInput, PutBucketLifecycleOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
  }
  
}

