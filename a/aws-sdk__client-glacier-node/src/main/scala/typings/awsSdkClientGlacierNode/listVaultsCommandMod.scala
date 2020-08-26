package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
import typings.awsSdkClientGlacierNode.typesListVaultsOutputMod.ListVaultsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListVaultsCommand", JSImport.Namespace)
@js.native
object listVaultsCommandMod extends js.Object {
  @js.native
  class ListVaultsCommand protected () extends Command[
          InputTypesUnion, 
          ListVaultsInput, 
          OutputTypesUnion, 
          ListVaultsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListVaultsInput) = this()
    val middlewareStack: MiddlewareStack[ListVaultsInput, ListVaultsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
  }
  
}

