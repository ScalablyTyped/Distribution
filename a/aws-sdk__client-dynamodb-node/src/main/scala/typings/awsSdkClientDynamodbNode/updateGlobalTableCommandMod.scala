package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableOutputMod.UpdateGlobalTableOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableCommand", "UpdateGlobalTableCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
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
