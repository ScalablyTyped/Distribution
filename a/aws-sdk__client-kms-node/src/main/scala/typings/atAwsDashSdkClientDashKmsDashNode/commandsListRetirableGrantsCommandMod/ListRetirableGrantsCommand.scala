package typings.atAwsDashSdkClientDashKmsDashNode.commandsListRetirableGrantsCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListRetirableGrantsCommand", "ListRetirableGrantsCommand")
@js.native
class ListRetirableGrantsCommand protected () extends Command[
      InputTypesUnion, 
      ListRetirableGrantsInput, 
      OutputTypesUnion, 
      ListRetirableGrantsOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListRetirableGrantsInput) = this()
  /* CompleteClass */
  override val input: ListRetirableGrantsInput = js.native
  val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
}

