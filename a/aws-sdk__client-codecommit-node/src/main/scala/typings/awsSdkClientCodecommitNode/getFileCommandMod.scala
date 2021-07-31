package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
import typings.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", "GetFileCommand")
  @js.native
  class GetFileCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetFileInput, 
          OutputTypesUnion, 
          GetFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetFileInput) = this()
    
    /* CompleteClass */
    override val input: GetFileInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[GetFileInput, GetFileOutput] = js.native
  }
}
