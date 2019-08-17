package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsScanCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesScanInputMod.ScanInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesScanOutputMod.ScanOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ScanCommand", "ScanCommand")
@js.native
class ScanCommand protected () extends Command[
      InputTypesUnion, 
      ScanInput, 
      OutputTypesUnion, 
      ScanOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: ScanInput) = this()
  /* CompleteClass */
  override val input: ScanInput = js.native
  val middlewareStack: MiddlewareStack[ScanInput, ScanOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ScanInput, ScanOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ScanInput, ScanOutput] = js.native
}

