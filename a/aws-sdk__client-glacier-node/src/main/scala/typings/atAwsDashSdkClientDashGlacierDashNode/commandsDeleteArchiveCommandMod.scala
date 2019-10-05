package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDeleteArchiveInputMod.DeleteArchiveInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesDeleteArchiveOutputMod.DeleteArchiveOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteArchiveCommand", JSImport.Namespace)
@js.native
object commandsDeleteArchiveCommandMod extends js.Object {
  @js.native
  class DeleteArchiveCommand protected () extends Command[
          InputTypesUnion, 
          DeleteArchiveInput, 
          OutputTypesUnion, 
          DeleteArchiveOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteArchiveInput) = this()
    /* CompleteClass */
    override val input: DeleteArchiveInput = js.native
    val middlewareStack: MiddlewareStack[DeleteArchiveInput, DeleteArchiveOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteArchiveInput, DeleteArchiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteArchiveInput, DeleteArchiveOutput] = js.native
  }
  
}

