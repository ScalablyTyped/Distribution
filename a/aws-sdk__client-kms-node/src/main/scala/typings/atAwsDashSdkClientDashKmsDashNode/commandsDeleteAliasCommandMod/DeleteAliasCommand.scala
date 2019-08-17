package typings.atAwsDashSdkClientDashKmsDashNode.commandsDeleteAliasCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesDeleteAliasInputMod.DeleteAliasInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesDeleteAliasOutputMod.DeleteAliasOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DeleteAliasCommand", "DeleteAliasCommand")
@js.native
class DeleteAliasCommand protected () extends Command[
      InputTypesUnion, 
      DeleteAliasInput, 
      OutputTypesUnion, 
      DeleteAliasOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteAliasInput) = this()
  /* CompleteClass */
  override val input: DeleteAliasInput = js.native
  val middlewareStack: MiddlewareStack[DeleteAliasInput, DeleteAliasOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
}

