package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
import typings.awsSdkClientGlacierNode.typesDescribeJobOutputMod.DescribeJobOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DescribeJobCommand", JSImport.Namespace)
@js.native
object describeJobCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeJobInput, DescribeJobOutput] = js.native
  }
  
}

