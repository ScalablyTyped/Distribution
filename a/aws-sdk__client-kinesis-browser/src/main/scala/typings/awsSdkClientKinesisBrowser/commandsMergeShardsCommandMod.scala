package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
import typings.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMergeShardsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/MergeShardsCommand", "MergeShardsCommand")
  @js.native
  open class MergeShardsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          MergeShardsInput, 
          OutputTypesUnion, 
          MergeShardsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: MergeShardsInput) = this()
    
    /* CompleteClass */
    override val input: MergeShardsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[MergeShardsInput, MergeShardsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
  }
}
