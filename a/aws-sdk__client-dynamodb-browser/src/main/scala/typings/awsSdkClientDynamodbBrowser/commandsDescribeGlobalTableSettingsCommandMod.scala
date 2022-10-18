package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsOutputMod.DescribeGlobalTableSettingsOutput
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeGlobalTableSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableSettingsCommand", "DescribeGlobalTableSettingsCommand")
  @js.native
  open class DescribeGlobalTableSettingsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeGlobalTableSettingsInput, 
          OutputTypesUnion, 
          DescribeGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeGlobalTableSettingsInput) = this()
    
    /* CompleteClass */
    override val input: DescribeGlobalTableSettingsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
  }
}
