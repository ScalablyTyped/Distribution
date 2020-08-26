package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typings.awsSdkClientKmsBrowser.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListRetirableGrantsCommand", JSImport.Namespace)
@js.native
object listRetirableGrantsCommandMod extends js.Object {
  @js.native
  class ListRetirableGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListRetirableGrantsInput, 
          OutputTypesUnion, 
          ListRetirableGrantsOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListRetirableGrantsInput) = this()
    val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  }
  
}

