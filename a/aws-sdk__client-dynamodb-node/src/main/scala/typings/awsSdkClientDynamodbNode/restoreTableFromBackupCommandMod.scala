package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
import typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupOutputMod.RestoreTableFromBackupOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/RestoreTableFromBackupCommand", JSImport.Namespace)
@js.native
object restoreTableFromBackupCommandMod extends js.Object {
  
  @js.native
  class RestoreTableFromBackupCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableFromBackupInput, 
          OutputTypesUnion, 
          RestoreTableFromBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: RestoreTableFromBackupInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
  }
}
