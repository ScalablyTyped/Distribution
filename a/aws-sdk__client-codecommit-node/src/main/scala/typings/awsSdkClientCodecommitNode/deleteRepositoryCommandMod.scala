package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput
import typings.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteRepositoryCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DeleteRepositoryCommand", "DeleteRepositoryCommand")
  @js.native
  class DeleteRepositoryCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteRepositoryInput, 
          OutputTypesUnion, 
          DeleteRepositoryOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteRepositoryInput) = this()
    
    /* CompleteClass */
    override val input: DeleteRepositoryInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteRepositoryInput, DeleteRepositoryOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteRepositoryInput, DeleteRepositoryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteRepositoryInput, DeleteRepositoryOutput] = js.native
  }
}
