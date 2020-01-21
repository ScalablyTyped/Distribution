package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
import typings.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketLocationCommand", JSImport.Namespace)
@js.native
object getBucketLocationCommandMod extends js.Object {
  @js.native
  class GetBucketLocationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLocationInput, 
          OutputTypesUnion, 
          GetBucketLocationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketLocationInput) = this()
    /* CompleteClass */
    override val input: GetBucketLocationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketLocationInput, GetBucketLocationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
  }
  
}

