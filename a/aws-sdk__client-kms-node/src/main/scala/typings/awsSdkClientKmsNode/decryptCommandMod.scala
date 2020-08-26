package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
import typings.awsSdkClientKmsNode.typesDecryptOutputMod.DecryptOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DecryptCommand", JSImport.Namespace)
@js.native
object decryptCommandMod extends js.Object {
  @js.native
  class DecryptCommand protected () extends Command[
          InputTypesUnion, 
          DecryptInput, 
          OutputTypesUnion, 
          DecryptOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DecryptInput) = this()
    val middlewareStack: MiddlewareStack[DecryptInput, DecryptOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
  }
  
}

