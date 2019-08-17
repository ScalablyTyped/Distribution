package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsPutKeyPolicyCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyOutputMod.PutKeyPolicyOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/PutKeyPolicyCommand", "PutKeyPolicyCommand")
@js.native
class PutKeyPolicyCommand protected () extends Command[
      InputTypesUnion, 
      PutKeyPolicyInput, 
      OutputTypesUnion, 
      PutKeyPolicyOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutKeyPolicyInput) = this()
  /* CompleteClass */
  override val input: PutKeyPolicyInput = js.native
  val middlewareStack: MiddlewareStack[PutKeyPolicyInput, PutKeyPolicyOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[PutKeyPolicyInput, PutKeyPolicyOutput] = js.native
}

