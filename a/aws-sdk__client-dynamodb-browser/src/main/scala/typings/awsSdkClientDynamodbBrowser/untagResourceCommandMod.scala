package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput
import typings.awsSdkClientDynamodbBrowser.typesUntagResourceOutputMod.UntagResourceOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UntagResourceCommand", JSImport.Namespace)
@js.native
object untagResourceCommandMod extends js.Object {
  @js.native
  class UntagResourceCommand protected () extends Command[
          InputTypesUnion, 
          UntagResourceInput, 
          OutputTypesUnion, 
          UntagResourceOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UntagResourceInput) = this()
    val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  }
  
}

