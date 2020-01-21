package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput
import typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemOutputMod.BatchWriteItemOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/BatchWriteItemCommand", JSImport.Namespace)
@js.native
object batchWriteItemCommandMod extends js.Object {
  @js.native
  class BatchWriteItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchWriteItemInput, 
          OutputTypesUnion, 
          BatchWriteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: BatchWriteItemInput) = this()
    /* CompleteClass */
    override val input: BatchWriteItemInput = js.native
    val middlewareStack: MiddlewareStack[BatchWriteItemInput, BatchWriteItemOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
  }
  
}

