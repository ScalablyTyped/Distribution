package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typings.awsSdkClientDynamodbNode.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGlobalTablesCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ListGlobalTablesCommand", "ListGlobalTablesCommand")
  @js.native
  class ListGlobalTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListGlobalTablesInput, 
          OutputTypesUnion, 
          ListGlobalTablesOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListGlobalTablesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  }
}
