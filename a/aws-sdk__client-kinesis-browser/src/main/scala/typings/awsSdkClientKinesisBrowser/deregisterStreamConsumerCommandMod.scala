package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
import typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeregisterStreamConsumerCommand", JSImport.Namespace)
@js.native
object deregisterStreamConsumerCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
  }
  
}

