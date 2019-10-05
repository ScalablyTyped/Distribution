package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateContinuousBackupsOutputMod.UpdateContinuousBackupsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateContinuousBackupsCommand", JSImport.Namespace)
@js.native
object commandsUpdateContinuousBackupsCommandMod extends js.Object {
  @js.native
  class UpdateContinuousBackupsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateContinuousBackupsInput, 
          OutputTypesUnion, 
          UpdateContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateContinuousBackupsInput) = this()
    /* CompleteClass */
    override val input: UpdateContinuousBackupsInput = js.native
    val middlewareStack: MiddlewareStack[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
  }
  
}

