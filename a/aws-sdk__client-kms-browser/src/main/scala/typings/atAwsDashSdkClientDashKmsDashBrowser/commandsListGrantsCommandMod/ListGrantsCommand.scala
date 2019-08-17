package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsListGrantsCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListGrantsInputMod.ListGrantsInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListGrantsOutputMod.ListGrantsOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListGrantsCommand", "ListGrantsCommand")
@js.native
class ListGrantsCommand protected () extends Command[
      InputTypesUnion, 
      ListGrantsInput, 
      OutputTypesUnion, 
      ListGrantsOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListGrantsInput) = this()
  /* CompleteClass */
  override val input: ListGrantsInput = js.native
  val middlewareStack: MiddlewareStack[ListGrantsInput, ListGrantsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
}

