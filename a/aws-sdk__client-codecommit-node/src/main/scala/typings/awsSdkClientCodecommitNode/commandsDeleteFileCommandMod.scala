package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
import typings.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DeleteFileCommand", "DeleteFileCommand")
  @js.native
  open class DeleteFileCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteFileInput, 
          OutputTypesUnion, 
          DeleteFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteFileInput) = this()
    
    /* CompleteClass */
    override val input: DeleteFileInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteFileInput, DeleteFileOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
  }
}
