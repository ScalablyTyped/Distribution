package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
import typings.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitShardCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/SplitShardCommand", "SplitShardCommand")
  @js.native
  class SplitShardCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SplitShardInput, 
          OutputTypesUnion, 
          SplitShardOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: SplitShardInput) = this()
    
    /* CompleteClass */
    override val input: SplitShardInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SplitShardInput, SplitShardOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
  }
}
