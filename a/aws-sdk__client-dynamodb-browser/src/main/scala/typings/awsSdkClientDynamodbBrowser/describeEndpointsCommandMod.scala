package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeEndpointsCommand", JSImport.Namespace)
@js.native
object describeEndpointsCommandMod extends js.Object {
  
  @js.native
  class DescribeEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeEndpointsInput, 
          OutputTypesUnion, 
          DescribeEndpointsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeEndpointsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  }
}
