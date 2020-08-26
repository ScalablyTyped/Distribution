package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput
import typings.awsSdkClientKmsNode.typesListKeysOutputMod.ListKeysOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListKeysCommand", JSImport.Namespace)
@js.native
object listKeysCommandMod extends js.Object {
  @js.native
  class ListKeysCommand protected () extends Command[
          InputTypesUnion, 
          ListKeysInput, 
          OutputTypesUnion, 
          ListKeysOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListKeysInput) = this()
    val middlewareStack: MiddlewareStack[ListKeysInput, ListKeysOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeysInput, ListKeysOutput] = js.native
  }
  
}

