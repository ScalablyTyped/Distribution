package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyOutputMod.DeleteFunctionConcurrencyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object deleteFunctionConcurrencyCommandMod extends js.Object {
  @js.native
  class DeleteFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionConcurrencyInput, 
          OutputTypesUnion, 
          DeleteFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFunctionConcurrencyInput) = this()
    val middlewareStack: MiddlewareStack[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
  }
  
}

