package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput
import typings.awsSdkClientDynamodbBrowser.typesTagResourceOutputMod.TagResourceOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/TagResourceCommand", JSImport.Namespace)
@js.native
object tagResourceCommandMod extends js.Object {
  @js.native
  class TagResourceCommand protected () extends Command[
          InputTypesUnion, 
          TagResourceInput, 
          OutputTypesUnion, 
          TagResourceOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: TagResourceInput) = this()
    /* CompleteClass */
    override val input: TagResourceInput = js.native
    val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
  }
  
}

