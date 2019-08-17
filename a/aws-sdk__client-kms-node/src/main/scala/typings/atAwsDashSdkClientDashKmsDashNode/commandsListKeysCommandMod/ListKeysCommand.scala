package typings.atAwsDashSdkClientDashKmsDashNode.commandsListKeysCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesListKeysInputMod.ListKeysInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesListKeysOutputMod.ListKeysOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListKeysCommand", "ListKeysCommand")
@js.native
class ListKeysCommand protected () extends Command[
      InputTypesUnion, 
      ListKeysInput, 
      OutputTypesUnion, 
      ListKeysOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListKeysInput) = this()
  /* CompleteClass */
  override val input: ListKeysInput = js.native
  val middlewareStack: MiddlewareStack[ListKeysInput, ListKeysOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeysInput, ListKeysOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ListKeysInput, ListKeysOutput] = js.native
}

