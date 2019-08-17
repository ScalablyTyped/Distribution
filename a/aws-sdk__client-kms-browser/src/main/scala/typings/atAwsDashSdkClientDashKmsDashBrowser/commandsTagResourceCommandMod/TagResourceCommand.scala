package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsTagResourceCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagResourceInputMod.TagResourceInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagResourceOutputMod.TagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/TagResourceCommand", "TagResourceCommand")
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
  /* CompleteClass */
  override val input: TagResourceInput = js.native
  val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
}

