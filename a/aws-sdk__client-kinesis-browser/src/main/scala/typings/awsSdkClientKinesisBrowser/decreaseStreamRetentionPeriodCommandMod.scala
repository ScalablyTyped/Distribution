package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
import typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DecreaseStreamRetentionPeriodCommand", JSImport.Namespace)
@js.native
object decreaseStreamRetentionPeriodCommandMod extends js.Object {
  @js.native
  class DecreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          DecreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          DecreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DecreaseStreamRetentionPeriodInput) = this()
    val middlewareStack: MiddlewareStack[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
  }
  
}

