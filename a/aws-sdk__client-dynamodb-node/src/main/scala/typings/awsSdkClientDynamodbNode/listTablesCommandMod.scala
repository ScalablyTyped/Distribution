package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput
import typings.awsSdkClientDynamodbNode.typesListTablesOutputMod.ListTablesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListTablesCommand", JSImport.Namespace)
@js.native
object listTablesCommandMod extends js.Object {
  @js.native
  class ListTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListTablesInput, 
          OutputTypesUnion, 
          ListTablesOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListTablesInput) = this()
    val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
  }
  
}

