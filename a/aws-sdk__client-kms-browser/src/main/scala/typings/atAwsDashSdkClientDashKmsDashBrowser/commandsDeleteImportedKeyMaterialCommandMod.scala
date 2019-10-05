package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDeleteImportedKeyMaterialOutputMod.DeleteImportedKeyMaterialOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DeleteImportedKeyMaterialCommand", JSImport.Namespace)
@js.native
object commandsDeleteImportedKeyMaterialCommandMod extends js.Object {
  @js.native
  class DeleteImportedKeyMaterialCommand protected () extends Command[
          InputTypesUnion, 
          DeleteImportedKeyMaterialInput, 
          OutputTypesUnion, 
          DeleteImportedKeyMaterialOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteImportedKeyMaterialInput) = this()
    /* CompleteClass */
    override val input: DeleteImportedKeyMaterialInput = js.native
    val middlewareStack: MiddlewareStack[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
  }
  
}

