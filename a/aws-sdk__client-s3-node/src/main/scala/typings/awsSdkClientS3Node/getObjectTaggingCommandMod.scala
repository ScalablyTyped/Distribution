package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput
import typings.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectTaggingCommand", JSImport.Namespace)
@js.native
object getObjectTaggingCommandMod extends js.Object {
  @js.native
  class GetObjectTaggingCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectTaggingInput, 
          OutputTypesUnion, 
          GetObjectTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetObjectTaggingInput) = this()
    /* CompleteClass */
    override val input: GetObjectTaggingInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectTaggingInput, GetObjectTaggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTaggingInput, GetObjectTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTaggingInput, GetObjectTaggingOutput] = js.native
  }
  
}

