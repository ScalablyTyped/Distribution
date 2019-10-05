package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesEnableKeyRotationOutputMod.EnableKeyRotationOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/EnableKeyRotationCommand", JSImport.Namespace)
@js.native
object commandsEnableKeyRotationCommandMod extends js.Object {
  @js.native
  class EnableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyRotationInput, 
          OutputTypesUnion, 
          EnableKeyRotationOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EnableKeyRotationInput) = this()
    /* CompleteClass */
    override val input: EnableKeyRotationInput = js.native
    val middlewareStack: MiddlewareStack[EnableKeyRotationInput, EnableKeyRotationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
  }
  
}

