package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
import typings.awsSdkClientDynamodbNode.typesDeleteItemOutputMod.DeleteItemOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteItemCommand", "DeleteItemCommand")
  @js.native
  open class DeleteItemCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteItemInput, 
          OutputTypesUnion, 
          DeleteItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DeleteItemInput) = this()
    
    /* CompleteClass */
    override val input: DeleteItemInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  }
}
