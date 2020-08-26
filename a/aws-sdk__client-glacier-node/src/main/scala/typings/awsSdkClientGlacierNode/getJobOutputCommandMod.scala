package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
import typings.awsSdkClientGlacierNode.typesGetJobOutputOutputMod.GetJobOutputOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetJobOutputCommand", JSImport.Namespace)
@js.native
object getJobOutputCommandMod extends js.Object {
  @js.native
  class GetJobOutputCommand protected () extends Command[
          InputTypesUnion, 
          GetJobOutputInput, 
          OutputTypesUnion, 
          GetJobOutputOutput[Readable], 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetJobOutputInput) = this()
    val middlewareStack: MiddlewareStack[GetJobOutputInput, GetJobOutputOutput[Readable], Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
  }
  
}

