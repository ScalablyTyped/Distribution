package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsListKeyPoliciesCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
@js.native
class ListKeyPoliciesCommand protected () extends Command[
      InputTypesUnion, 
      ListKeyPoliciesInput, 
      OutputTypesUnion, 
      ListKeyPoliciesOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListKeyPoliciesInput) = this()
  /* CompleteClass */
  override val input: ListKeyPoliciesInput = js.native
  val middlewareStack: MiddlewareStack[ListKeyPoliciesInput, ListKeyPoliciesOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
}

