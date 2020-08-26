package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
import typings.awsSdkClientLambdaNode.typesListAliasesOutputMod.ListAliasesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListAliasesCommand", JSImport.Namespace)
@js.native
object listAliasesCommandMod extends js.Object {
  @js.native
  class ListAliasesCommand protected () extends Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListAliasesInput) = this()
    val middlewareStack: MiddlewareStack[ListAliasesInput, ListAliasesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
  
}

