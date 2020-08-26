package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationOutputMod.UpdateFunctionConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionConfigurationCommand", JSImport.Namespace)
@js.native
object updateFunctionConfigurationCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
  }
  
}

