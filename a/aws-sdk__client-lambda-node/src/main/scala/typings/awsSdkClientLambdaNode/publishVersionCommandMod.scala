package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
import typings.awsSdkClientLambdaNode.typesPublishVersionOutputMod.PublishVersionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/PublishVersionCommand", JSImport.Namespace)
@js.native
object publishVersionCommandMod extends js.Object {
  @js.native
  class PublishVersionCommand protected () extends Command[
          InputTypesUnion, 
          PublishVersionInput, 
          OutputTypesUnion, 
          PublishVersionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: PublishVersionInput) = this()
    val middlewareStack: MiddlewareStack[PublishVersionInput, PublishVersionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
  }
  
}

