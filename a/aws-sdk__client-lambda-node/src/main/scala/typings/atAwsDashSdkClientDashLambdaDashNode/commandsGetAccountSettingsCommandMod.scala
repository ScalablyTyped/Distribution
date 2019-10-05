package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetAccountSettingsOutputMod.GetAccountSettingsOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAccountSettingsCommand", JSImport.Namespace)
@js.native
object commandsGetAccountSettingsCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: GetAccountSettingsInput = js.native
    val middlewareStack: MiddlewareStack[GetAccountSettingsInput, GetAccountSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
  }
  
}

