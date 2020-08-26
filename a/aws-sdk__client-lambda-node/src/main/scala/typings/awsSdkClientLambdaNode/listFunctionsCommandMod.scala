package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typings.awsSdkClientLambdaNode.typesListFunctionsOutputMod.ListFunctionsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListFunctionsCommand", JSImport.Namespace)
@js.native
object listFunctionsCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[ListFunctionsInput, ListFunctionsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
  }
  
}

