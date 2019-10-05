package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPublishVersionInputMod.PublishVersionInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPublishVersionOutputMod.PublishVersionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/PublishVersionCommand", JSImport.Namespace)
@js.native
object commandsPublishVersionCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: PublishVersionInput = js.native
    val middlewareStack: MiddlewareStack[PublishVersionInput, PublishVersionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
  }
  
}

