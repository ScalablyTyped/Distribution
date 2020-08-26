package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
import typings.awsSdkClientDynamodbNode.typesDeleteItemOutputMod.DeleteItemOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteItemCommand", JSImport.Namespace)
@js.native
object deleteItemCommandMod extends js.Object {
  @js.native
  class DeleteItemCommand protected () extends Command[
          InputTypesUnion, 
          DeleteItemInput, 
          OutputTypesUnion, 
          DeleteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteItemInput) = this()
    val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  }
  
}

