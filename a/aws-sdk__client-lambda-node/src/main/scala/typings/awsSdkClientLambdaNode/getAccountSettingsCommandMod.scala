package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typings.awsSdkClientLambdaNode.typesGetAccountSettingsOutputMod.GetAccountSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAccountSettingsCommand", JSImport.Namespace)
@js.native
object getAccountSettingsCommandMod extends js.Object {
  @js.native
  class GetAccountSettingsCommand protected () extends Command[
          InputTypesUnion, 
          GetAccountSettingsInput, 
          OutputTypesUnion, 
          GetAccountSettingsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetAccountSettingsInput) = this()
    val middlewareStack: MiddlewareStack[GetAccountSettingsInput, GetAccountSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
  }
  
}

