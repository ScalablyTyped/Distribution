package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
import typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetFolderCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetFolderCommand", "GetFolderCommand")
  @js.native
  open class GetFolderCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetFolderInput, 
          OutputTypesUnion, 
          GetFolderOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetFolderInput) = this()
    
    /* CompleteClass */
    override val input: GetFolderInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetFolderInput, GetFolderOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
  }
}
