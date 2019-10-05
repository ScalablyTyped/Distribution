package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableToPointInTimeOutputMod.RestoreTableToPointInTimeOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/RestoreTableToPointInTimeCommand", JSImport.Namespace)
@js.native
object commandsRestoreTableToPointInTimeCommandMod extends js.Object {
  @js.native
  class RestoreTableToPointInTimeCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableToPointInTimeInput, 
          OutputTypesUnion, 
          RestoreTableToPointInTimeOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: RestoreTableToPointInTimeInput) = this()
    /* CompleteClass */
    override val input: RestoreTableToPointInTimeInput = js.native
    val middlewareStack: MiddlewareStack[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
  }
  
}

