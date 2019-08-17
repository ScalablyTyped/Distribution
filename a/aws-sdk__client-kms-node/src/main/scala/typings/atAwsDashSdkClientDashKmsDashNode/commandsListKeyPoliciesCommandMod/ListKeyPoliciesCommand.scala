package typings.atAwsDashSdkClientDashKmsDashNode.commandsListKeyPoliciesCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
@js.native
class ListKeyPoliciesCommand protected () extends Command[
      InputTypesUnion, 
      ListKeyPoliciesInput, 
      OutputTypesUnion, 
      ListKeyPoliciesOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListKeyPoliciesInput) = this()
  /* CompleteClass */
  override val input: ListKeyPoliciesInput = js.native
  val middlewareStack: MiddlewareStack[ListKeyPoliciesInput, ListKeyPoliciesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
}

