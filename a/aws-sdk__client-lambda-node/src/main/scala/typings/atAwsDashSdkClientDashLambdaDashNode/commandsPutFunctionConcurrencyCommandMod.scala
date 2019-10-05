package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPutFunctionConcurrencyOutputMod.PutFunctionConcurrencyOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/PutFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object commandsPutFunctionConcurrencyCommandMod extends js.Object {
  @js.native
  class PutFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          PutFunctionConcurrencyInput, 
          OutputTypesUnion, 
          PutFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutFunctionConcurrencyInput) = this()
    /* CompleteClass */
    override val input: PutFunctionConcurrencyInput = js.native
    val middlewareStack: MiddlewareStack[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
  }
  
}

