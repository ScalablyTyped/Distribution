package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
import typings.awsSdkClientLambdaNode.typesInvokeOutputMod.InvokeOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/InvokeCommand", JSImport.Namespace)
@js.native
object invokeCommandMod extends js.Object {
  @js.native
  class InvokeCommand protected () extends Command[
          InputTypesUnion, 
          InvokeInput, 
          OutputTypesUnion, 
          InvokeOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: InvokeInput) = this()
    val middlewareStack: MiddlewareStack[InvokeInput, InvokeOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeInput, InvokeOutput] = js.native
  }
  
}

