package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
import typings.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateRepositoryNameCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryNameCommand", "UpdateRepositoryNameCommand")
  @js.native
  open class UpdateRepositoryNameCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateRepositoryNameInput, 
          OutputTypesUnion, 
          UpdateRepositoryNameOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateRepositoryNameInput) = this()
    
    /* CompleteClass */
    override val input: UpdateRepositoryNameInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
  }
}
