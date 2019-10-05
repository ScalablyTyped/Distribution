package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesListFunctionsInputMod.ListFunctionsInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesListFunctionsOutputMod.ListFunctionsOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListFunctionsCommand", JSImport.Namespace)
@js.native
object commandsListFunctionsCommandMod extends js.Object {
  @js.native
  class ListFunctionsCommand protected () extends Command[
          InputTypesUnion, 
          ListFunctionsInput, 
          OutputTypesUnion, 
          ListFunctionsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListFunctionsInput) = this()
    /* CompleteClass */
    override val input: ListFunctionsInput = js.native
    val middlewareStack: MiddlewareStack[ListFunctionsInput, ListFunctionsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
  }
  
}

