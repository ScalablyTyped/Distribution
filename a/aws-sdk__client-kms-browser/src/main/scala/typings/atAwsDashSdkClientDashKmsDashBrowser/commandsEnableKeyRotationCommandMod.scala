package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEnableKeyRotationOutputMod.EnableKeyRotationOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/EnableKeyRotationCommand", JSImport.Namespace)
@js.native
object commandsEnableKeyRotationCommandMod extends js.Object {
  @js.native
  class EnableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyRotationInput, 
          OutputTypesUnion, 
          EnableKeyRotationOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: EnableKeyRotationInput) = this()
    /* CompleteClass */
    override val input: EnableKeyRotationInput = js.native
    val middlewareStack: MiddlewareStack[EnableKeyRotationInput, EnableKeyRotationOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
  }
  
}

