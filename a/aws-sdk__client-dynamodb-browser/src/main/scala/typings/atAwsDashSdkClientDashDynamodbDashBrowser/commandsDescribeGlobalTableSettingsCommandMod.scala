package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableSettingsOutputMod.DescribeGlobalTableSettingsOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object commandsDescribeGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class DescribeGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableSettingsInput, 
          OutputTypesUnion, 
          DescribeGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeGlobalTableSettingsInput) = this()
    /* CompleteClass */
    override val input: DescribeGlobalTableSettingsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
  }
  
}

