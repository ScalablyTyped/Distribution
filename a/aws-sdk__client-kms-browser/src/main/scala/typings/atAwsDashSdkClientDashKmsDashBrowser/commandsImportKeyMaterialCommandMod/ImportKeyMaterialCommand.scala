package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsImportKeyMaterialCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesImportKeyMaterialOutputMod.ImportKeyMaterialOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ImportKeyMaterialCommand", "ImportKeyMaterialCommand")
@js.native
class ImportKeyMaterialCommand protected () extends Command[
      InputTypesUnion, 
      ImportKeyMaterialInput, 
      OutputTypesUnion, 
      ImportKeyMaterialOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: ImportKeyMaterialInput) = this()
  /* CompleteClass */
  override val input: ImportKeyMaterialInput = js.native
  val middlewareStack: MiddlewareStack[ImportKeyMaterialInput, ImportKeyMaterialOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
}

