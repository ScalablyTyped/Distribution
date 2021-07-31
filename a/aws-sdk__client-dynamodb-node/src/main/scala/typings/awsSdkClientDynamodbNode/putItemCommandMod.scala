package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput
import typings.awsSdkClientDynamodbNode.typesPutItemOutputMod.PutItemOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/PutItemCommand", "PutItemCommand")
  @js.native
  class PutItemCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutItemInput, 
          OutputTypesUnion, 
          PutItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: PutItemInput) = this()
    
    /* CompleteClass */
    override val input: PutItemInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutItemInput, PutItemOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[PutItemInput, PutItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[PutItemInput, PutItemOutput] = js.native
  }
}
