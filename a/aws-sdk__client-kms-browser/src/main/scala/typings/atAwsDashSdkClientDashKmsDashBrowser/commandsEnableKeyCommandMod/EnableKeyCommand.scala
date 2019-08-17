package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsEnableKeyCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEnableKeyInputMod.EnableKeyInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEnableKeyOutputMod.EnableKeyOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/EnableKeyCommand", "EnableKeyCommand")
@js.native
class EnableKeyCommand protected () extends Command[
      InputTypesUnion, 
      EnableKeyInput, 
      OutputTypesUnion, 
      EnableKeyOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: EnableKeyInput) = this()
  /* CompleteClass */
  override val input: EnableKeyInput = js.native
  val middlewareStack: MiddlewareStack[EnableKeyInput, EnableKeyOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
}

