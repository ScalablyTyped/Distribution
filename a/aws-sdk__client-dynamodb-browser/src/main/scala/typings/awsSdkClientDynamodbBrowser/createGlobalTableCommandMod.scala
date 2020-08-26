package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableOutputMod.CreateGlobalTableOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateGlobalTableCommand", JSImport.Namespace)
@js.native
object createGlobalTableCommandMod extends js.Object {
  @js.native
  class CreateGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          CreateGlobalTableInput, 
          OutputTypesUnion, 
          CreateGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateGlobalTableInput) = this()
    val middlewareStack: MiddlewareStack[CreateGlobalTableInput, CreateGlobalTableOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
  }
  
}

