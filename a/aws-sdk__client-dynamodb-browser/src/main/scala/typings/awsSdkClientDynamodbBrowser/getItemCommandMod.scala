package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput
import typings.awsSdkClientDynamodbBrowser.typesGetItemOutputMod.GetItemOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/GetItemCommand", JSImport.Namespace)
@js.native
object getItemCommandMod extends js.Object {
  
  @js.native
  class GetItemCommand protected () extends Command[
          InputTypesUnion, 
          GetItemInput, 
          OutputTypesUnion, 
          GetItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: GetItemInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
  }
}
