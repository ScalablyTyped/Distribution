package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput
import typings.awsSdkClientDynamodbNode.typesListTablesOutputMod.ListTablesOutput
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListTablesCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ListTablesCommand", "ListTablesCommand")
  @js.native
  open class ListTablesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListTablesInput, 
          OutputTypesUnion, 
          ListTablesOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListTablesInput) = this()
    
    /* CompleteClass */
    override val input: ListTablesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
  }
}
