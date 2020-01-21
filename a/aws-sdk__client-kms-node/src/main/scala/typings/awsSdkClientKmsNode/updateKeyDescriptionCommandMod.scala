package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/UpdateKeyDescriptionCommand", JSImport.Namespace)
@js.native
object updateKeyDescriptionCommandMod extends js.Object {
  @js.native
  class UpdateKeyDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateKeyDescriptionInput, 
          OutputTypesUnion, 
          UpdateKeyDescriptionOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateKeyDescriptionInput) = this()
    /* CompleteClass */
    override val input: UpdateKeyDescriptionInput = js.native
    val middlewareStack: MiddlewareStack[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  }
  
}

