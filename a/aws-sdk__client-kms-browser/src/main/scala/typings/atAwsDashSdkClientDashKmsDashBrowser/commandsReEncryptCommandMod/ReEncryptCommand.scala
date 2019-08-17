package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsReEncryptCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptInputMod.ReEncryptInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptOutputMod.ReEncryptOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ReEncryptCommand", "ReEncryptCommand")
@js.native
class ReEncryptCommand protected () extends Command[
      InputTypesUnion, 
      ReEncryptInput, 
      OutputTypesUnion, 
      ReEncryptOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: ReEncryptInput) = this()
  /* CompleteClass */
  override val input: ReEncryptInput = js.native
  val middlewareStack: MiddlewareStack[ReEncryptInput, ReEncryptOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
}

