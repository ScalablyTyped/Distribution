package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsDescribeLimitsCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeLimitsCommand", "DescribeLimitsCommand")
@js.native
class DescribeLimitsCommand protected () extends Command[
      InputTypesUnion, 
      DescribeLimitsInput, 
      OutputTypesUnion, 
      DescribeLimitsOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeLimitsInput) = this()
  /* CompleteClass */
  override val input: DescribeLimitsInput = js.native
  val middlewareStack: MiddlewareStack[DescribeLimitsInput, DescribeLimitsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
}

