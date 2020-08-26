package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
import typings.awsSdkClientDynamodbNode.typesUpdateTableOutputMod.UpdateTableOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTableCommand", JSImport.Namespace)
@js.native
object updateTableCommandMod extends js.Object {
  @js.native
  class UpdateTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTableInput, 
          OutputTypesUnion, 
          UpdateTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateTableInput) = this()
    val middlewareStack: MiddlewareStack[UpdateTableInput, UpdateTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTableInput, UpdateTableOutput] = js.native
  }
  
}

