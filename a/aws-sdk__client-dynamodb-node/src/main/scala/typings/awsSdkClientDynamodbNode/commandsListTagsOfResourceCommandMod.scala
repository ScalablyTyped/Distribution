package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
import typings.awsSdkClientDynamodbNode.typesListTagsOfResourceOutputMod.ListTagsOfResourceOutput
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListTagsOfResourceCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ListTagsOfResourceCommand", "ListTagsOfResourceCommand")
  @js.native
  open class ListTagsOfResourceCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListTagsOfResourceInput, 
          OutputTypesUnion, 
          ListTagsOfResourceOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListTagsOfResourceInput) = this()
    
    /* CompleteClass */
    override val input: ListTagsOfResourceInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
  }
}
