package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteFunctionInputMod.DeleteFunctionInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteFunctionOutputMod.DeleteFunctionOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionCommand", JSImport.Namespace)
@js.native
object commandsDeleteFunctionCommandMod extends js.Object {
  @js.native
  class DeleteFunctionCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionInput, 
          OutputTypesUnion, 
          DeleteFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFunctionInput) = this()
    /* CompleteClass */
    override val input: DeleteFunctionInput = js.native
    val middlewareStack: MiddlewareStack[DeleteFunctionInput, DeleteFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
  }
  
}

