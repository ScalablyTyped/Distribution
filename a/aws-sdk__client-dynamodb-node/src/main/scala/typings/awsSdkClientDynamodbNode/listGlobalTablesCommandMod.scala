package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typings.awsSdkClientDynamodbNode.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGlobalTablesCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ListGlobalTablesCommand", "ListGlobalTablesCommand")
  @js.native
  open class ListGlobalTablesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListGlobalTablesInput, 
          OutputTypesUnion, 
          ListGlobalTablesOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListGlobalTablesInput) = this()
    
    /* CompleteClass */
    override val input: ListGlobalTablesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  }
}
