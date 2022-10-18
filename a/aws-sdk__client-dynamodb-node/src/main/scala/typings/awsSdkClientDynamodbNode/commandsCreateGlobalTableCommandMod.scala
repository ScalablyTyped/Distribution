package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput
import typings.awsSdkClientDynamodbNode.typesCreateGlobalTableOutputMod.CreateGlobalTableOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/CreateGlobalTableCommand", "CreateGlobalTableCommand")
  @js.native
  open class CreateGlobalTableCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateGlobalTableInput, 
          OutputTypesUnion, 
          CreateGlobalTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: CreateGlobalTableInput) = this()
    
    /* CompleteClass */
    override val input: CreateGlobalTableInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
  }
}
