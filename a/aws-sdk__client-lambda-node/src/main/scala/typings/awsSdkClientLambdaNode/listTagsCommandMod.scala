package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typings.awsSdkClientLambdaNode.typesListTagsOutputMod.ListTagsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListTagsCommand", JSImport.Namespace)
@js.native
object listTagsCommandMod extends js.Object {
  @js.native
  class ListTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsInput, 
          OutputTypesUnion, 
          ListTagsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListTagsInput) = this()
    val middlewareStack: MiddlewareStack[ListTagsInput, ListTagsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
  }
  
}

