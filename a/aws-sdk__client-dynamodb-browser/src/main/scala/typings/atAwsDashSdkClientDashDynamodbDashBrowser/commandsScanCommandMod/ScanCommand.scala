package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsScanCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesScanInputMod.ScanInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesScanOutputMod.ScanOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ScanCommand", "ScanCommand")
@js.native
class ScanCommand protected () extends Command[
      InputTypesUnion, 
      ScanInput, 
      OutputTypesUnion, 
      ScanOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: ScanInput) = this()
  /* CompleteClass */
  override val input: ScanInput = js.native
  val middlewareStack: MiddlewareStack[ScanInput, ScanOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ScanInput, ScanOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ScanInput, ScanOutput] = js.native
}

