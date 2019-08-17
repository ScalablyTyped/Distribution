package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsRegisterStreamConsumerCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/RegisterStreamConsumerCommand", "RegisterStreamConsumerCommand")
@js.native
class RegisterStreamConsumerCommand protected () extends Command[
      InputTypesUnion, 
      RegisterStreamConsumerInput, 
      OutputTypesUnion, 
      RegisterStreamConsumerOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: RegisterStreamConsumerInput) = this()
  /* CompleteClass */
  override val input: RegisterStreamConsumerInput = js.native
  val middlewareStack: MiddlewareStack[RegisterStreamConsumerInput, RegisterStreamConsumerOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
}

