package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
import typings.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListShardsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/ListShardsCommand", "ListShardsCommand")
  @js.native
  open class ListShardsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListShardsInput, 
          OutputTypesUnion, 
          ListShardsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListShardsInput) = this()
    
    /* CompleteClass */
    override val input: ListShardsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListShardsInput, ListShardsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
  }
}
