package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTagsOfResourceOutputMod.ListTagsOfResourceOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListTagsOfResourceCommand", JSImport.Namespace)
@js.native
object commandsListTagsOfResourceCommandMod extends js.Object {
  @js.native
  class ListTagsOfResourceCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsOfResourceInput, 
          OutputTypesUnion, 
          ListTagsOfResourceOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTagsOfResourceInput) = this()
    /* CompleteClass */
    override val input: ListTagsOfResourceInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsOfResourceInput, ListTagsOfResourceOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
  }
  
}

