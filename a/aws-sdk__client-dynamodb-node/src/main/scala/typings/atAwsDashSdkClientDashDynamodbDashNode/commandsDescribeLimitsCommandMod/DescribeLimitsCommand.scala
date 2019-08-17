package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDescribeLimitsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeLimitsInputMod.DescribeLimitsInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeLimitsCommand", "DescribeLimitsCommand")
@js.native
class DescribeLimitsCommand protected () extends Command[
      InputTypesUnion, 
      DescribeLimitsInput, 
      OutputTypesUnion, 
      DescribeLimitsOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeLimitsInput) = this()
  /* CompleteClass */
  override val input: DescribeLimitsInput = js.native
  val middlewareStack: MiddlewareStack[DescribeLimitsInput, DescribeLimitsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
}

