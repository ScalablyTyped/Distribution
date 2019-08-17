package typings.atAwsDashSdkClientDashGlacierDashNode.commandsAddTagsToVaultCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AddTagsToVaultCommand", "AddTagsToVaultCommand")
@js.native
class AddTagsToVaultCommand protected () extends Command[
      InputTypesUnion, 
      AddTagsToVaultInput, 
      OutputTypesUnion, 
      AddTagsToVaultOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: AddTagsToVaultInput) = this()
  /* CompleteClass */
  override val input: AddTagsToVaultInput = js.native
  val middlewareStack: MiddlewareStack[AddTagsToVaultInput, AddTagsToVaultOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
}

