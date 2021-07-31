package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput
import typings.awsSdkClientDynamodbNode.typesTagResourceOutputMod.TagResourceOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/TagResourceCommand", "TagResourceCommand")
  @js.native
  class TagResourceCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          TagResourceInput, 
          OutputTypesUnion, 
          TagResourceOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: TagResourceInput) = this()
    
    /* CompleteClass */
    override val input: TagResourceInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
  }
}
