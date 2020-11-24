package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
import typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordCommand", JSImport.Namespace)
@js.native
object putRecordCommandMod extends js.Object {
  
  @js.native
  class PutRecordCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordInput, 
          OutputTypesUnion, 
          PutRecordOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: PutRecordInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
  }
}
