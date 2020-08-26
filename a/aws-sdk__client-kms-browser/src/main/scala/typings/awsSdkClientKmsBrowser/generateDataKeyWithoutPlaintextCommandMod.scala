package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyWithoutPlaintextCommand", JSImport.Namespace)
@js.native
object generateDataKeyWithoutPlaintextCommandMod extends js.Object {
  @js.native
  class GenerateDataKeyWithoutPlaintextCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyWithoutPlaintextInput, 
          OutputTypesUnion, 
          GenerateDataKeyWithoutPlaintextOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GenerateDataKeyWithoutPlaintextInput) = this()
    val middlewareStack: MiddlewareStack[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
  }
  
}

