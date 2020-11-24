package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeGlobalTableCommand", JSImport.Namespace)
@js.native
object describeGlobalTableCommandMod extends js.Object {
  
  @js.native
  class DescribeGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableInput, 
          OutputTypesUnion, 
          DescribeGlobalTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeGlobalTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  }
}
