package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
import typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetRepositoryTriggersCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryTriggersCommand", "GetRepositoryTriggersCommand")
  @js.native
  open class GetRepositoryTriggersCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetRepositoryTriggersInput, 
          OutputTypesUnion, 
          GetRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetRepositoryTriggersInput) = this()
    
    /* CompleteClass */
    override val input: GetRepositoryTriggersInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
  }
}
