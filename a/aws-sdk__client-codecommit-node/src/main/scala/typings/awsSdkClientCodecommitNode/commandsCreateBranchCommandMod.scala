package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
import typings.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateBranchCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/CreateBranchCommand", "CreateBranchCommand")
  @js.native
  open class CreateBranchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateBranchInput, 
          OutputTypesUnion, 
          CreateBranchOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: CreateBranchInput) = this()
    
    /* CompleteClass */
    override val input: CreateBranchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateBranchInput, CreateBranchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
  }
}
