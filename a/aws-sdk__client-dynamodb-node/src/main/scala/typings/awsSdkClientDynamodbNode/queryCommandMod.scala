package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput
import typings.awsSdkClientDynamodbNode.typesQueryOutputMod.QueryOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/QueryCommand", "QueryCommand")
  @js.native
  class QueryCommand protected () extends Command[
          InputTypesUnion, 
          QueryInput, 
          OutputTypesUnion, 
          QueryOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: QueryInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
  }
}
