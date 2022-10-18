package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
import typings.awsSdkClientDynamodbBrowser.typesCreateBackupOutputMod.CreateBackupOutput
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateBackupCommand", "CreateBackupCommand")
  @js.native
  open class CreateBackupCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateBackupInput, 
          OutputTypesUnion, 
          CreateBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: CreateBackupInput) = this()
    
    /* CompleteClass */
    override val input: CreateBackupInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateBackupInput, CreateBackupOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
  }
}
