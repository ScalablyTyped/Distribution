package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput
import typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListObjectsCommand", JSImport.Namespace)
@js.native
object listObjectsCommandMod extends js.Object {
  @js.native
  class ListObjectsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectsInput, 
          OutputTypesUnion, 
          ListObjectsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListObjectsInput) = this()
    /* CompleteClass */
    override val input: ListObjectsInput = js.native
    val middlewareStack: MiddlewareStack[ListObjectsInput, ListObjectsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  }
  
}

