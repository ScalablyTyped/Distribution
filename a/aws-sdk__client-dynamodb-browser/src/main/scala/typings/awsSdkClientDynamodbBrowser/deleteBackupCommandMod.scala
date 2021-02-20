package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
import typings.awsSdkClientDynamodbBrowser.typesDeleteBackupOutputMod.DeleteBackupOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteBackupCommand", "DeleteBackupCommand")
  @js.native
  class DeleteBackupCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBackupInput, 
          OutputTypesUnion, 
          DeleteBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DeleteBackupInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
  }
}
