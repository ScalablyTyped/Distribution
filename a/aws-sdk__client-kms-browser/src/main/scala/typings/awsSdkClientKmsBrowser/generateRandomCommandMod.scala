package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput
import typings.awsSdkClientKmsBrowser.typesGenerateRandomOutputMod.GenerateRandomOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GenerateRandomCommand", JSImport.Namespace)
@js.native
object generateRandomCommandMod extends js.Object {
  @js.native
  class GenerateRandomCommand protected () extends Command[
          InputTypesUnion, 
          GenerateRandomInput, 
          OutputTypesUnion, 
          GenerateRandomOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GenerateRandomInput) = this()
    /* CompleteClass */
    override val input: GenerateRandomInput = js.native
    val middlewareStack: MiddlewareStack[GenerateRandomInput, GenerateRandomOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
  }
  
}

