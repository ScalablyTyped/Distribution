package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeBackupInputMod.DescribeBackupInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeBackupOutputMod.DescribeBackupOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeBackupCommand", JSImport.Namespace)
@js.native
object commandsDescribeBackupCommandMod extends js.Object {
  @js.native
  class DescribeBackupCommand protected () extends Command[
          InputTypesUnion, 
          DescribeBackupInput, 
          OutputTypesUnion, 
          DescribeBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeBackupInput) = this()
    /* CompleteClass */
    override val input: DescribeBackupInput = js.native
    val middlewareStack: MiddlewareStack[DescribeBackupInput, DescribeBackupOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeBackupInput, DescribeBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeBackupInput, DescribeBackupOutput] = js.native
  }
  
}

