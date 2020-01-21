package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
import typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsOutputMod.DescribeGlobalTableSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object describeGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class DescribeGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableSettingsInput, 
          OutputTypesUnion, 
          DescribeGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeGlobalTableSettingsInput) = this()
    /* CompleteClass */
    override val input: DescribeGlobalTableSettingsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
  }
  
}

