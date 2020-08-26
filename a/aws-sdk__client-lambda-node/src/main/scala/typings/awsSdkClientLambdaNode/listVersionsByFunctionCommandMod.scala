package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionOutputMod.ListVersionsByFunctionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListVersionsByFunctionCommand", JSImport.Namespace)
@js.native
object listVersionsByFunctionCommandMod extends js.Object {
  @js.native
  class ListVersionsByFunctionCommand protected () extends Command[
          InputTypesUnion, 
          ListVersionsByFunctionInput, 
          OutputTypesUnion, 
          ListVersionsByFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListVersionsByFunctionInput) = this()
    val middlewareStack: MiddlewareStack[ListVersionsByFunctionInput, ListVersionsByFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
  }
  
}

