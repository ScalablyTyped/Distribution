package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput
import typings.awsSdkClientDynamodbBrowser.typesDeleteItemOutputMod.DeleteItemOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteItemCommand", JSImport.Namespace)
@js.native
object deleteItemCommandMod extends js.Object {
  @js.native
  class DeleteItemCommand protected () extends Command[
          InputTypesUnion, 
          DeleteItemInput, 
          OutputTypesUnion, 
          DeleteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteItemInput) = this()
    /* CompleteClass */
    override val input: DeleteItemInput = js.native
    val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  }
  
}

