package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsDeregisterStreamConsumerCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeregisterStreamConsumerCommand", "DeregisterStreamConsumerCommand")
@js.native
class DeregisterStreamConsumerCommand protected () extends Command[
      InputTypesUnion, 
      DeregisterStreamConsumerInput, 
      OutputTypesUnion, 
      DeregisterStreamConsumerOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeregisterStreamConsumerInput) = this()
  /* CompleteClass */
  override val input: DeregisterStreamConsumerInput = js.native
  val middlewareStack: MiddlewareStack[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
}

