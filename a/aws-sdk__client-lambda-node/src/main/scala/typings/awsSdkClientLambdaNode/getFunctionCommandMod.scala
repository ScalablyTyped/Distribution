package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
import typings.awsSdkClientLambdaNode.typesGetFunctionOutputMod.GetFunctionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionCommand", JSImport.Namespace)
@js.native
object getFunctionCommandMod extends js.Object {
  @js.native
  class GetFunctionCommand protected () extends Command[
          InputTypesUnion, 
          GetFunctionInput, 
          OutputTypesUnion, 
          GetFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFunctionInput) = this()
    /* CompleteClass */
    override val input: GetFunctionInput = js.native
    val middlewareStack: MiddlewareStack[GetFunctionInput, GetFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
  }
  
}

