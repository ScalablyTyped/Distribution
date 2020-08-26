package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
import typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeOutputMod.UpdateFunctionCodeOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionCodeCommand", JSImport.Namespace)
@js.native
object updateFunctionCodeCommandMod extends js.Object {
  @js.native
  class UpdateFunctionCodeCommand protected () extends Command[
          InputTypesUnion, 
          UpdateFunctionCodeInput, 
          OutputTypesUnion, 
          UpdateFunctionCodeOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateFunctionCodeInput) = this()
    val middlewareStack: MiddlewareStack[UpdateFunctionCodeInput, UpdateFunctionCodeOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
  }
  
}

