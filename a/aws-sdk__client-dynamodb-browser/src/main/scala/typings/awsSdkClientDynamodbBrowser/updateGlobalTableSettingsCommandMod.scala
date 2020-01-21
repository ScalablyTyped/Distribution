package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object updateGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class UpdateGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableSettingsInput, 
          OutputTypesUnion, 
          UpdateGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateGlobalTableSettingsInput) = this()
    /* CompleteClass */
    override val input: UpdateGlobalTableSettingsInput = js.native
    val middlewareStack: MiddlewareStack[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  }
  
}

