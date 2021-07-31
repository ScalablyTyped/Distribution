package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGlobalTableSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableSettingsCommand", "UpdateGlobalTableSettingsCommand")
  @js.native
  class UpdateGlobalTableSettingsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateGlobalTableSettingsInput, 
          OutputTypesUnion, 
          UpdateGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateGlobalTableSettingsInput) = this()
    
    /* CompleteClass */
    override val input: UpdateGlobalTableSettingsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  }
}
