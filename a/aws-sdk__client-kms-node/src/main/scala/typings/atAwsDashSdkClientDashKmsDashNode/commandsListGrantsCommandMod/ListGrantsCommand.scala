package typings.atAwsDashSdkClientDashKmsDashNode.commandsListGrantsCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListGrantsInputMod.ListGrantsInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesListGrantsOutputMod.ListGrantsOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListGrantsCommand", "ListGrantsCommand")
@js.native
class ListGrantsCommand protected () extends Command[
      InputTypesUnion, 
      ListGrantsInput, 
      OutputTypesUnion, 
      ListGrantsOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListGrantsInput) = this()
  /* CompleteClass */
  override val input: ListGrantsInput = js.native
  val middlewareStack: MiddlewareStack[ListGrantsInput, ListGrantsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
}

