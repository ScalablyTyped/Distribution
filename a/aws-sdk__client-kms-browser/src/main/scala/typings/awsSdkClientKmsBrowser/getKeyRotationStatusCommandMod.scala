package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
import typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusOutputMod.GetKeyRotationStatusOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GetKeyRotationStatusCommand", JSImport.Namespace)
@js.native
object getKeyRotationStatusCommandMod extends js.Object {
  @js.native
  class GetKeyRotationStatusCommand protected () extends Command[
          InputTypesUnion, 
          GetKeyRotationStatusInput, 
          OutputTypesUnion, 
          GetKeyRotationStatusOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetKeyRotationStatusInput) = this()
    val middlewareStack: MiddlewareStack[GetKeyRotationStatusInput, GetKeyRotationStatusOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
  }
  
}

