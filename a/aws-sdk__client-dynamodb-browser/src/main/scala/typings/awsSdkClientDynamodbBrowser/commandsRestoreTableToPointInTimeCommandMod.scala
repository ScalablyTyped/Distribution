package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
import typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeOutputMod.RestoreTableToPointInTimeOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRestoreTableToPointInTimeCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/RestoreTableToPointInTimeCommand", "RestoreTableToPointInTimeCommand")
  @js.native
  open class RestoreTableToPointInTimeCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RestoreTableToPointInTimeInput, 
          OutputTypesUnion, 
          RestoreTableToPointInTimeOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: RestoreTableToPointInTimeInput) = this()
    
    /* CompleteClass */
    override val input: RestoreTableToPointInTimeInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
  }
}
