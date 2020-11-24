package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput
import typings.awsSdkClientDynamodbNode.typesUpdateItemOutputMod.UpdateItemOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateItemCommand", JSImport.Namespace)
@js.native
object updateItemCommandMod extends js.Object {
  
  @js.native
  class UpdateItemCommand protected () extends Command[
          InputTypesUnion, 
          UpdateItemInput, 
          OutputTypesUnion, 
          UpdateItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateItemInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateItemInput, UpdateItemOutput] = js.native
  }
}
