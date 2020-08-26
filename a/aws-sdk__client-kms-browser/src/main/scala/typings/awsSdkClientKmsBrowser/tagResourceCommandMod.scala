package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput
import typings.awsSdkClientKmsBrowser.typesTagResourceOutputMod.TagResourceOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/TagResourceCommand", JSImport.Namespace)
@js.native
object tagResourceCommandMod extends js.Object {
  @js.native
  class TagResourceCommand protected () extends Command[
          InputTypesUnion, 
          TagResourceInput, 
          OutputTypesUnion, 
          TagResourceOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: TagResourceInput) = this()
    val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
  }
  
}

