package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsGenerateRandomCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateRandomInputMod.GenerateRandomInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateRandomOutputMod.GenerateRandomOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GenerateRandomCommand", "GenerateRandomCommand")
@js.native
class GenerateRandomCommand protected () extends Command[
      InputTypesUnion, 
      GenerateRandomInput, 
      OutputTypesUnion, 
      GenerateRandomOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: GenerateRandomInput) = this()
  /* CompleteClass */
  override val input: GenerateRandomInput = js.native
  val middlewareStack: MiddlewareStack[GenerateRandomInput, GenerateRandomOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
}

