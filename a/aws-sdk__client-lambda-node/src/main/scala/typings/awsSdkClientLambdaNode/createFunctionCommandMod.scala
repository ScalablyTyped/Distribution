package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
import typings.awsSdkClientLambdaNode.typesCreateFunctionOutputMod.CreateFunctionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateFunctionCommand", JSImport.Namespace)
@js.native
object createFunctionCommandMod extends js.Object {
  @js.native
  class CreateFunctionCommand protected () extends Command[
          InputTypesUnion, 
          CreateFunctionInput, 
          OutputTypesUnion, 
          CreateFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateFunctionInput) = this()
    val middlewareStack: MiddlewareStack[CreateFunctionInput, CreateFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
  }
  
}

