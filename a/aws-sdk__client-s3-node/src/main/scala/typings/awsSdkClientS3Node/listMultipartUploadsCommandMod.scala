package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typings.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListMultipartUploadsCommand", JSImport.Namespace)
@js.native
object listMultipartUploadsCommandMod extends js.Object {
  @js.native
  class ListMultipartUploadsCommand protected () extends Command[
          InputTypesUnion, 
          ListMultipartUploadsInput, 
          OutputTypesUnion, 
          ListMultipartUploadsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListMultipartUploadsInput) = this()
    val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  }
  
}

