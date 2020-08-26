package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
import typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveOutputMod.UpdateTimeToLiveOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTimeToLiveCommand", JSImport.Namespace)
@js.native
object updateTimeToLiveCommandMod extends js.Object {
  @js.native
  class UpdateTimeToLiveCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTimeToLiveInput, 
          OutputTypesUnion, 
          UpdateTimeToLiveOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateTimeToLiveInput) = this()
    val middlewareStack: MiddlewareStack[UpdateTimeToLiveInput, UpdateTimeToLiveOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
  }
  
}

