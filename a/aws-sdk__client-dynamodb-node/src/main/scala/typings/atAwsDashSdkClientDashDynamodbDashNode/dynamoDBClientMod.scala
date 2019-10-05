package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/DynamoDBClient", JSImport.Namespace)
@js.native
object dynamoDBClientMod extends js.Object {
  @js.native
  class DynamoDBClient protected () extends js.Object {
    def this(configuration: DynamoDBConfiguration) = this()
    val config: DynamoDBResolvedConfiguration = js.native
    val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable] = js.native
    def destroy(): Unit = js.native
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          DynamoDBResolvedConfiguration, 
          Readable
        ]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          DynamoDBResolvedConfiguration, 
          Readable
        ],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
  
}

