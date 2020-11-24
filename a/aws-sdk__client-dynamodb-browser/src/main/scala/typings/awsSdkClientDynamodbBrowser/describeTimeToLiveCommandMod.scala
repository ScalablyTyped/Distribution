package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveOutputMod.DescribeTimeToLiveOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTimeToLiveCommand", JSImport.Namespace)
@js.native
object describeTimeToLiveCommandMod extends js.Object {
  
  @js.native
  class DescribeTimeToLiveCommand protected () extends Command[
          InputTypesUnion, 
          DescribeTimeToLiveInput, 
          OutputTypesUnion, 
          DescribeTimeToLiveOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeTimeToLiveInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
  }
}
