package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object updateGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class UpdateGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableSettingsInput, 
          OutputTypesUnion, 
          UpdateGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateGlobalTableSettingsInput) = this()
    val middlewareStack: MiddlewareStack[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  }
  
}

