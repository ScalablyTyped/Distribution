package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobInputMod.GetBlobInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBlobOutputMod.GetBlobOutput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBlobCommand", JSImport.Namespace)
@js.native
object commandsGetBlobCommandMod extends js.Object {
  @js.native
  class GetBlobCommand protected () extends Command[
          InputTypesUnion, 
          GetBlobInput, 
          OutputTypesUnion, 
          GetBlobOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBlobInput) = this()
    /* CompleteClass */
    override val input: GetBlobInput = js.native
    val middlewareStack: MiddlewareStack[GetBlobInput, GetBlobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
  }
  
}

