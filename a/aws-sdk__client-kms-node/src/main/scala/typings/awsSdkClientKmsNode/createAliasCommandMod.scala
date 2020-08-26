package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
import typings.awsSdkClientKmsNode.typesCreateAliasOutputMod.CreateAliasOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateAliasCommand", JSImport.Namespace)
@js.native
object createAliasCommandMod extends js.Object {
  @js.native
  class CreateAliasCommand protected () extends Command[
          InputTypesUnion, 
          CreateAliasInput, 
          OutputTypesUnion, 
          CreateAliasOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateAliasInput) = this()
    val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
  
}

