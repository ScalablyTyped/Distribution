package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
import typings.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listStreamsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamsCommand", "ListStreamsCommand")
  @js.native
  class ListStreamsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListStreamsInput, 
          OutputTypesUnion, 
          ListStreamsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListStreamsInput) = this()
    
    /* CompleteClass */
    override val input: ListStreamsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListStreamsInput, ListStreamsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
  }
}
