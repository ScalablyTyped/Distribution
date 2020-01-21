package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
import typings.awsSdkClientKmsBrowser.typesRetireGrantOutputMod.RetireGrantOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RetireGrantCommand", JSImport.Namespace)
@js.native
object retireGrantCommandMod extends js.Object {
  @js.native
  class RetireGrantCommand protected () extends Command[
          InputTypesUnion, 
          RetireGrantInput, 
          OutputTypesUnion, 
          RetireGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: RetireGrantInput) = this()
    /* CompleteClass */
    override val input: RetireGrantInput = js.native
    val middlewareStack: MiddlewareStack[RetireGrantInput, RetireGrantOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
  }
  
}

