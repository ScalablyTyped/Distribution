package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput
import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemOutputMod.BatchGetItemOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/BatchGetItemCommand", JSImport.Namespace)
@js.native
object batchGetItemCommandMod extends js.Object {
  @js.native
  class BatchGetItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetItemInput, 
          OutputTypesUnion, 
          BatchGetItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: BatchGetItemInput) = this()
    /* CompleteClass */
    override val input: BatchGetItemInput = js.native
    val middlewareStack: MiddlewareStack[BatchGetItemInput, BatchGetItemOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
  }
  
}

