package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyOutputMod.PutFunctionConcurrencyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/PutFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object putFunctionConcurrencyCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
  }
  
}

