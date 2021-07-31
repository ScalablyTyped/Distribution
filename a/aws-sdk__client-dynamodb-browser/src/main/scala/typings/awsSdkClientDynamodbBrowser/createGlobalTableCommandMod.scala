package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableOutputMod.CreateGlobalTableOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateGlobalTableCommand", "CreateGlobalTableCommand")
  @js.native
  class CreateGlobalTableCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
  }
}
