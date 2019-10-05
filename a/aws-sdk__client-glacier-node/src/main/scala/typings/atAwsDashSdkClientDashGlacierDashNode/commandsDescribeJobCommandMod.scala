package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDescribeJobInputMod.DescribeJobInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDescribeJobOutputMod.DescribeJobOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DescribeJobCommand", JSImport.Namespace)
@js.native
object commandsDescribeJobCommandMod extends js.Object {
  @js.native
  class DescribeJobCommand protected () extends Command[
          InputTypesUnion, 
          DescribeJobInput, 
          OutputTypesUnion, 
          DescribeJobOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeJobInput) = this()
    /* CompleteClass */
    override val input: DescribeJobInput = js.native
    val middlewareStack: MiddlewareStack[DescribeJobInput, DescribeJobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeJobInput, DescribeJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeJobInput, DescribeJobOutput] = js.native
  }
  
}

