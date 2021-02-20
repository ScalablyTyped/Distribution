package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput
import typings.awsSdkClientDynamodbBrowser.typesQueryOutputMod.QueryOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/QueryCommand", "QueryCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
  }
}
