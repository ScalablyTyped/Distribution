package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsRevokeGrantCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesRevokeGrantInputMod.RevokeGrantInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesRevokeGrantOutputMod.RevokeGrantOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RevokeGrantCommand", "RevokeGrantCommand")
@js.native
class RevokeGrantCommand protected () extends Command[
      InputTypesUnion, 
      RevokeGrantInput, 
      OutputTypesUnion, 
      RevokeGrantOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: RevokeGrantInput) = this()
  /* CompleteClass */
  override val input: RevokeGrantInput = js.native
  val middlewareStack: MiddlewareStack[RevokeGrantInput, RevokeGrantOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
}

