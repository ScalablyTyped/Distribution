package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableOutputMod.UpdateGlobalTableOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateGlobalTableCommand", "UpdateGlobalTableCommand")
  @js.native
  open class UpdateGlobalTableCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateGlobalTableInput, 
          OutputTypesUnion, 
          UpdateGlobalTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateGlobalTableInput) = this()
    
    /* CompleteClass */
    override val input: UpdateGlobalTableInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
  }
}
