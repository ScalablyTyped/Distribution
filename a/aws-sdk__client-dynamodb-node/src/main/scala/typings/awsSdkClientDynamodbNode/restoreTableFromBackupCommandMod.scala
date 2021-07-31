package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
import typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupOutputMod.RestoreTableFromBackupOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreTableFromBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/RestoreTableFromBackupCommand", "RestoreTableFromBackupCommand")
  @js.native
  class RestoreTableFromBackupCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RestoreTableFromBackupInput, 
          OutputTypesUnion, 
          RestoreTableFromBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: RestoreTableFromBackupInput) = this()
    
    /* CompleteClass */
    override val input: RestoreTableFromBackupInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
  }
}
