package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
import typings.awsSdkClientGlacierNode.typesCreateVaultOutputMod.CreateVaultOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/CreateVaultCommand", JSImport.Namespace)
@js.native
object createVaultCommandMod extends js.Object {
  @js.native
  class CreateVaultCommand protected () extends Command[
          InputTypesUnion, 
          CreateVaultInput, 
          OutputTypesUnion, 
          CreateVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateVaultInput) = this()
    val middlewareStack: MiddlewareStack[CreateVaultInput, CreateVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[CreateVaultInput, CreateVaultOutput] = js.native
  }
  
}

