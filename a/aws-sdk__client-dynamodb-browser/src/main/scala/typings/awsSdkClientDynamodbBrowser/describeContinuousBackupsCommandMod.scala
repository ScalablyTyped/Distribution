package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeContinuousBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
  @js.native
  class DescribeContinuousBackupsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  }
}
