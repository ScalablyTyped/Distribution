package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typings.awsSdkClientGlacierNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMultipartUploadsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListMultipartUploadsCommand", "ListMultipartUploadsCommand")
  @js.native
  class ListMultipartUploadsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListMultipartUploadsInput, 
          OutputTypesUnion, 
          ListMultipartUploadsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListMultipartUploadsInput) = this()
    
    /* CompleteClass */
    override val input: ListMultipartUploadsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  }
}
