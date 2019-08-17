package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsListRetirableGrantsCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListRetirableGrantsCommand", "ListRetirableGrantsCommand")
@js.native
class ListRetirableGrantsCommand protected () extends Command[
      InputTypesUnion, 
      ListRetirableGrantsInput, 
      OutputTypesUnion, 
      ListRetirableGrantsOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListRetirableGrantsInput) = this()
  /* CompleteClass */
  override val input: ListRetirableGrantsInput = js.native
  val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
}

