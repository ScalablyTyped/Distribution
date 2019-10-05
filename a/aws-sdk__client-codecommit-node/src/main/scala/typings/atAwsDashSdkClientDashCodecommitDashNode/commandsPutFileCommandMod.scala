package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileInputMod.PutFileInput
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileOutputMod.PutFileOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PutFileCommand", JSImport.Namespace)
@js.native
object commandsPutFileCommandMod extends js.Object {
  @js.native
  class PutFileCommand protected () extends Command[
          InputTypesUnion, 
          PutFileInput, 
          OutputTypesUnion, 
          PutFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutFileInput) = this()
    /* CompleteClass */
    override val input: PutFileInput = js.native
    val middlewareStack: MiddlewareStack[PutFileInput, PutFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutFileInput, PutFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutFileInput, PutFileOutput] = js.native
  }
  
}

