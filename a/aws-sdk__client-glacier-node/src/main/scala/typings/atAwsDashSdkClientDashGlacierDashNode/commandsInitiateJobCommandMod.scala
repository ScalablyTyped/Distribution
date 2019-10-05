package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobInputMod.InitiateJobInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobOutputMod.InitiateJobOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateJobCommand", JSImport.Namespace)
@js.native
object commandsInitiateJobCommandMod extends js.Object {
  @js.native
  class InitiateJobCommand protected () extends Command[
          InputTypesUnion, 
          InitiateJobInput, 
          OutputTypesUnion, 
          InitiateJobOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: InitiateJobInput) = this()
    /* CompleteClass */
    override val input: InitiateJobInput = js.native
    val middlewareStack: MiddlewareStack[InitiateJobInput, InitiateJobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
  }
  
}

