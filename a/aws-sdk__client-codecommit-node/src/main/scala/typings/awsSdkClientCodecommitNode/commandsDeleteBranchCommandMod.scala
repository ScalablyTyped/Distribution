package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
import typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBranchCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DeleteBranchCommand", "DeleteBranchCommand")
  @js.native
  open class DeleteBranchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBranchInput, 
          OutputTypesUnion, 
          DeleteBranchOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteBranchInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBranchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBranchInput, DeleteBranchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
  }
}
