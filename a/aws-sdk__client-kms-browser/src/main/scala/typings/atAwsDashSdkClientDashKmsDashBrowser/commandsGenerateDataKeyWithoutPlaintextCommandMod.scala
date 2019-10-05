package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyWithoutPlaintextCommand", JSImport.Namespace)
@js.native
object commandsGenerateDataKeyWithoutPlaintextCommandMod extends js.Object {
  @js.native
  class GenerateDataKeyWithoutPlaintextCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyWithoutPlaintextInput, 
          OutputTypesUnion, 
          GenerateDataKeyWithoutPlaintextOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GenerateDataKeyWithoutPlaintextInput) = this()
    /* CompleteClass */
    override val input: GenerateDataKeyWithoutPlaintextInput = js.native
    val middlewareStack: MiddlewareStack[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
  }
  
}

