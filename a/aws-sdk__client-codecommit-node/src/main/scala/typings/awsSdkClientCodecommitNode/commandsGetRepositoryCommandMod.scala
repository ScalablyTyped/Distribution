package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
import typings.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetRepositoryCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryCommand", "GetRepositoryCommand")
  @js.native
  open class GetRepositoryCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetRepositoryInput, 
          OutputTypesUnion, 
          GetRepositoryOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetRepositoryInput) = this()
    
    /* CompleteClass */
    override val input: GetRepositoryInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetRepositoryInput, GetRepositoryOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
  }
}
