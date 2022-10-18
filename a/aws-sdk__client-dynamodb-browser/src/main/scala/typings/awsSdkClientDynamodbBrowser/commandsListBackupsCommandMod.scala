package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput
import typings.awsSdkClientDynamodbBrowser.typesListBackupsOutputMod.ListBackupsOutput
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/ListBackupsCommand", "ListBackupsCommand")
  @js.native
  open class ListBackupsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListBackupsInput, 
          OutputTypesUnion, 
          ListBackupsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListBackupsInput) = this()
    
    /* CompleteClass */
    override val input: ListBackupsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListBackupsInput, ListBackupsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
  }
}
