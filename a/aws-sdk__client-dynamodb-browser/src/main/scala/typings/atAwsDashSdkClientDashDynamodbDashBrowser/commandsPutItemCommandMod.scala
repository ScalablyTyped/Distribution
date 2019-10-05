package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesPutItemInputMod.PutItemInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesPutItemOutputMod.PutItemOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/PutItemCommand", JSImport.Namespace)
@js.native
object commandsPutItemCommandMod extends js.Object {
  @js.native
  class PutItemCommand protected () extends Command[
          InputTypesUnion, 
          PutItemInput, 
          OutputTypesUnion, 
          PutItemOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutItemInput) = this()
    /* CompleteClass */
    override val input: PutItemInput = js.native
    val middlewareStack: MiddlewareStack[PutItemInput, PutItemOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[PutItemInput, PutItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[PutItemInput, PutItemOutput] = js.native
  }
  
}

