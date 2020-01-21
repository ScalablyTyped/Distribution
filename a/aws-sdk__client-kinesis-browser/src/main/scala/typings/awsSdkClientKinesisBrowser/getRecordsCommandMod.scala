package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
import typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetRecordsCommand", JSImport.Namespace)
@js.native
object getRecordsCommandMod extends js.Object {
  @js.native
  class GetRecordsCommand protected () extends Command[
          InputTypesUnion, 
          GetRecordsInput, 
          OutputTypesUnion, 
          GetRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetRecordsInput) = this()
    /* CompleteClass */
    override val input: GetRecordsInput = js.native
    val middlewareStack: MiddlewareStack[GetRecordsInput, GetRecordsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
  }
  
}

