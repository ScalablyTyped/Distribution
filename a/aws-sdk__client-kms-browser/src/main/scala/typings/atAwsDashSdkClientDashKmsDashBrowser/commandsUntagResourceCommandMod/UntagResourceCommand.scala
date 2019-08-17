package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsUntagResourceCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUntagResourceInputMod.UntagResourceInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUntagResourceOutputMod.UntagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/UntagResourceCommand", "UntagResourceCommand")
@js.native
class UntagResourceCommand protected () extends Command[
      InputTypesUnion, 
      UntagResourceInput, 
      OutputTypesUnion, 
      UntagResourceOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: UntagResourceInput) = this()
  /* CompleteClass */
  override val input: UntagResourceInput = js.native
  val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
}

