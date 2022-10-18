package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
import typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateRepositoryCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/CreateRepositoryCommand", "CreateRepositoryCommand")
  @js.native
  open class CreateRepositoryCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateRepositoryInput, 
          OutputTypesUnion, 
          CreateRepositoryOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: CreateRepositoryInput) = this()
    
    /* CompleteClass */
    override val input: CreateRepositoryInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateRepositoryInput, CreateRepositoryOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
  }
}
