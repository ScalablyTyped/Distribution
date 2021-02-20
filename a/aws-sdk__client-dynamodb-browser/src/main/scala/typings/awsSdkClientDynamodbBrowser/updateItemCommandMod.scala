package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput
import typings.awsSdkClientDynamodbBrowser.typesUpdateItemOutputMod.UpdateItemOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateItemCommand", "UpdateItemCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateItemInput, UpdateItemOutput] = js.native
  }
}
