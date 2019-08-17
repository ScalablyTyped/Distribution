package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsUpdateKeyDescriptionCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/UpdateKeyDescriptionCommand", "UpdateKeyDescriptionCommand")
@js.native
class UpdateKeyDescriptionCommand protected () extends Command[
      InputTypesUnion, 
      UpdateKeyDescriptionInput, 
      OutputTypesUnion, 
      UpdateKeyDescriptionOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateKeyDescriptionInput) = this()
  /* CompleteClass */
  override val input: UpdateKeyDescriptionInput = js.native
  val middlewareStack: MiddlewareStack[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
}

