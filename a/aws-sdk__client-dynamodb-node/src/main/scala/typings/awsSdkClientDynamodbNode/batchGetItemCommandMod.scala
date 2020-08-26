package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
import typings.awsSdkClientDynamodbNode.typesBatchGetItemOutputMod.BatchGetItemOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/BatchGetItemCommand", JSImport.Namespace)
@js.native
object batchGetItemCommandMod extends js.Object {
  @js.native
  class BatchGetItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetItemInput, 
          OutputTypesUnion, 
          BatchGetItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetItemInput) = this()
    val middlewareStack: MiddlewareStack[BatchGetItemInput, BatchGetItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
  }
  
}

