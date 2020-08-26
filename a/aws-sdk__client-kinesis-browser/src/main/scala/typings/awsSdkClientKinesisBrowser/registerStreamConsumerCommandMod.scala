package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
import typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/RegisterStreamConsumerCommand", JSImport.Namespace)
@js.native
object registerStreamConsumerCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[RegisterStreamConsumerInput, RegisterStreamConsumerOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
  }
  
}

