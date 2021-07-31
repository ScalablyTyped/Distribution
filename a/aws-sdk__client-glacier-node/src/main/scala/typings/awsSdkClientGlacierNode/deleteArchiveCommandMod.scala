package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
import typings.awsSdkClientGlacierNode.typesDeleteArchiveOutputMod.DeleteArchiveOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteArchiveCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DeleteArchiveCommand", "DeleteArchiveCommand")
  @js.native
  class DeleteArchiveCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteArchiveInput, 
          OutputTypesUnion, 
          DeleteArchiveOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DeleteArchiveInput) = this()
    
    /* CompleteClass */
    override val input: DeleteArchiveInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteArchiveInput, DeleteArchiveOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteArchiveInput, DeleteArchiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteArchiveInput, DeleteArchiveOutput] = js.native
  }
}
