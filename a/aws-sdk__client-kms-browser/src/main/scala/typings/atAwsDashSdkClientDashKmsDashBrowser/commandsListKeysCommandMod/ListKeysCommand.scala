package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsListKeysCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeysInputMod.ListKeysInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeysOutputMod.ListKeysOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListKeysCommand", "ListKeysCommand")
@js.native
class ListKeysCommand protected () extends Command[
      InputTypesUnion, 
      ListKeysInput, 
      OutputTypesUnion, 
      ListKeysOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListKeysInput) = this()
  /* CompleteClass */
  override val input: ListKeysInput = js.native
  val middlewareStack: MiddlewareStack[ListKeysInput, ListKeysOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeysInput, ListKeysOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeysInput, ListKeysOutput] = js.native
}

