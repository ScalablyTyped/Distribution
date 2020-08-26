package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput
import typings.awsSdkClientKmsBrowser.typesListResourceTagsOutputMod.ListResourceTagsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListResourceTagsCommand", JSImport.Namespace)
@js.native
object listResourceTagsCommandMod extends js.Object {
  @js.native
  class ListResourceTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListResourceTagsInput, 
          OutputTypesUnion, 
          ListResourceTagsOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListResourceTagsInput) = this()
    val middlewareStack: MiddlewareStack[ListResourceTagsInput, ListResourceTagsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
  }
  
}

