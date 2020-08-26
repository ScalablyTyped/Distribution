package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
import typings.awsSdkClientKmsBrowser.typesReEncryptOutputMod.ReEncryptOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ReEncryptCommand", JSImport.Namespace)
@js.native
object reEncryptCommandMod extends js.Object {
  @js.native
  class ReEncryptCommand protected () extends Command[
          InputTypesUnion, 
          ReEncryptInput, 
          OutputTypesUnion, 
          ReEncryptOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ReEncryptInput) = this()
    val middlewareStack: MiddlewareStack[ReEncryptInput, ReEncryptOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
  }
  
}

