package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsListBackupsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListBackupsInputMod.ListBackupsInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListBackupsOutputMod.ListBackupsOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListBackupsCommand", "ListBackupsCommand")
@js.native
class ListBackupsCommand protected () extends Command[
      InputTypesUnion, 
      ListBackupsInput, 
      OutputTypesUnion, 
      ListBackupsOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListBackupsInput) = this()
  /* CompleteClass */
  override val input: ListBackupsInput = js.native
  val middlewareStack: MiddlewareStack[ListBackupsInput, ListBackupsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
}

