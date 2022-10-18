package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeContinuousBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
  @js.native
  open class DescribeContinuousBackupsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeContinuousBackupsInput, 
          OutputTypesUnion, 
          DescribeContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeContinuousBackupsInput) = this()
    
    /* CompleteClass */
    override val input: DescribeContinuousBackupsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  }
}
