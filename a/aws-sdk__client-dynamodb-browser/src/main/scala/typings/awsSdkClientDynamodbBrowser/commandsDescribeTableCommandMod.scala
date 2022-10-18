package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeTableOutputMod.DescribeTableOutput
import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTableCommand", "DescribeTableCommand")
  @js.native
  open class DescribeTableCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeTableInput, 
          OutputTypesUnion, 
          DescribeTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeTableInput) = this()
    
    /* CompleteClass */
    override val input: DescribeTableInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeTableInput, DescribeTableOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
  }
}
