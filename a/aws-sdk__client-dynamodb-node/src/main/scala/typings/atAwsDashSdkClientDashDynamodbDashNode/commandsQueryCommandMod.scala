package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesQueryInputMod.QueryInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesQueryOutputMod.QueryOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/QueryCommand", JSImport.Namespace)
@js.native
object commandsQueryCommandMod extends js.Object {
  @js.native
  class QueryCommand protected () extends Command[
          InputTypesUnion, 
          QueryInput, 
          OutputTypesUnion, 
          QueryOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: QueryInput) = this()
    /* CompleteClass */
    override val input: QueryInput = js.native
    val middlewareStack: MiddlewareStack[QueryInput, QueryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
  }
  
}

