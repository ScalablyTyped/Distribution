package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptInputMod.EncryptInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptOutputMod.EncryptOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/EncryptCommand", JSImport.Namespace)
@js.native
object commandsEncryptCommandMod extends js.Object {
  @js.native
  class EncryptCommand protected () extends Command[
          InputTypesUnion, 
          EncryptInput, 
          OutputTypesUnion, 
          EncryptOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: EncryptInput) = this()
    /* CompleteClass */
    override val input: EncryptInput = js.native
    val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
  }
  
}

