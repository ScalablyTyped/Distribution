package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput
import typings.awsSdkClientDynamodbNode.typesGetItemOutputMod.GetItemOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/GetItemCommand", "GetItemCommand")
  @js.native
  open class GetItemCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetItemInput, 
          OutputTypesUnion, 
          GetItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: GetItemInput) = this()
    
    /* CompleteClass */
    override val input: GetItemInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetItemInput, GetItemOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[GetItemInput, GetItemOutput] = js.native
  }
}
