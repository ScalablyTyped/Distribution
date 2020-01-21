package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
import typings.awsSdkClientKmsBrowser.typesListAliasesOutputMod.ListAliasesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListAliasesCommand", JSImport.Namespace)
@js.native
object listAliasesCommandMod extends js.Object {
  @js.native
  class ListAliasesCommand protected () extends Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListAliasesInput) = this()
    /* CompleteClass */
    override val input: ListAliasesInput = js.native
    val middlewareStack: MiddlewareStack[ListAliasesInput, ListAliasesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
  
}

