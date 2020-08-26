package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
import typings.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketVersioningCommand", JSImport.Namespace)
@js.native
object getBucketVersioningCommandMod extends js.Object {
  @js.native
  class GetBucketVersioningCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketVersioningInput, 
          OutputTypesUnion, 
          GetBucketVersioningOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketVersioningInput) = this()
    val middlewareStack: MiddlewareStack[GetBucketVersioningInput, GetBucketVersioningOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
  }
  
}

