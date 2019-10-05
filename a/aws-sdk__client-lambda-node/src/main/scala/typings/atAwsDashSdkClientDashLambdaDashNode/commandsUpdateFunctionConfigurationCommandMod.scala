package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationOutputMod.UpdateFunctionConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionConfigurationCommand", JSImport.Namespace)
@js.native
object commandsUpdateFunctionConfigurationCommandMod extends js.Object {
  @js.native
  class UpdateFunctionConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          UpdateFunctionConfigurationInput, 
          OutputTypesUnion, 
          UpdateFunctionConfigurationOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateFunctionConfigurationInput) = this()
    /* CompleteClass */
    override val input: UpdateFunctionConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
  }
  
}

