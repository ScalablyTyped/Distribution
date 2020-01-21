package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typings.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListJobsCommand", JSImport.Namespace)
@js.native
object listJobsCommandMod extends js.Object {
  @js.native
  class ListJobsCommand protected () extends Command[
          InputTypesUnion, 
          ListJobsInput, 
          OutputTypesUnion, 
          ListJobsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListJobsInput) = this()
    /* CompleteClass */
    override val input: ListJobsInput = js.native
    val middlewareStack: MiddlewareStack[ListJobsInput, ListJobsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
  }
  
}

