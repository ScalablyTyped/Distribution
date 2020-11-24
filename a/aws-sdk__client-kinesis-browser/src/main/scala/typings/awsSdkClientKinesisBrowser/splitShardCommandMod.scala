package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
import typings.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/SplitShardCommand", JSImport.Namespace)
@js.native
object splitShardCommandMod extends js.Object {
  
  @js.native
  class SplitShardCommand protected () extends Command[
          InputTypesUnion, 
          SplitShardInput, 
          OutputTypesUnion, 
          SplitShardOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: SplitShardInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
  }
}
