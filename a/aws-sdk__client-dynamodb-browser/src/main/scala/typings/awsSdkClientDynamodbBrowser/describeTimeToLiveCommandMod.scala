package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveOutputMod.DescribeTimeToLiveOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeTimeToLiveCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTimeToLiveCommand", "DescribeTimeToLiveCommand")
  @js.native
  class DescribeTimeToLiveCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeTimeToLiveInput, 
          OutputTypesUnion, 
          DescribeTimeToLiveOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeTimeToLiveInput) = this()
    
    /* CompleteClass */
    override val input: DescribeTimeToLiveInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
  }
}
