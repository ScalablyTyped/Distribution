package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput
import typings.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCommitCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetCommitCommand", "GetCommitCommand")
  @js.native
  open class GetCommitCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCommitInput, 
          OutputTypesUnion, 
          GetCommitOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetCommitInput) = this()
    
    /* CompleteClass */
    override val input: GetCommitInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCommitInput, GetCommitOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommitInput, GetCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetCommitInput, GetCommitOutput] = js.native
  }
}
