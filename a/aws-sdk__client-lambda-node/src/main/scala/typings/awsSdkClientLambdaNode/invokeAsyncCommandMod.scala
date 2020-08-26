package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typings.awsSdkClientLambdaNode.typesInvokeAsyncOutputMod.InvokeAsyncOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/InvokeAsyncCommand", JSImport.Namespace)
@js.native
object invokeAsyncCommandMod extends js.Object {
  @js.native
  class InvokeAsyncCommand protected () extends Command[
          InputTypesUnion, 
          InvokeAsyncInput[Readable], 
          OutputTypesUnion, 
          InvokeAsyncOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: InvokeAsyncInput[Readable]) = this()
    val middlewareStack: MiddlewareStack[InvokeAsyncInput[Readable], InvokeAsyncOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
  }
  
}

