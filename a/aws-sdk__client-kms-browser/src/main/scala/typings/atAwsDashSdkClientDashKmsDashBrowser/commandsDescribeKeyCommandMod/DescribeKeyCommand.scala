package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsDescribeKeyCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDescribeKeyInputMod.DescribeKeyInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDescribeKeyOutputMod.DescribeKeyOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DescribeKeyCommand", "DescribeKeyCommand")
@js.native
class DescribeKeyCommand protected () extends Command[
      InputTypesUnion, 
      DescribeKeyInput, 
      OutputTypesUnion, 
      DescribeKeyOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeKeyInput) = this()
  /* CompleteClass */
  override val input: DescribeKeyInput = js.native
  val middlewareStack: MiddlewareStack[DescribeKeyInput, DescribeKeyOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
}

