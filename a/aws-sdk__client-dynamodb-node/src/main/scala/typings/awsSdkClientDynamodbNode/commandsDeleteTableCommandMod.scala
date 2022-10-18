package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput
import typings.awsSdkClientDynamodbNode.typesDeleteTableOutputMod.DeleteTableOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteTableCommand", "DeleteTableCommand")
  @js.native
  open class DeleteTableCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteTableInput, 
          OutputTypesUnion, 
          DeleteTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DeleteTableInput) = this()
    
    /* CompleteClass */
    override val input: DeleteTableInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteTableInput, DeleteTableOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
  }
}
