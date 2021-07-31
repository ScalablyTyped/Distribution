package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
import typings.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PutFileCommand", "PutFileCommand")
  @js.native
  class PutFileCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutFileInput, 
          OutputTypesUnion, 
          PutFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PutFileInput) = this()
    
    /* CompleteClass */
    override val input: PutFileInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutFileInput, PutFileOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutFileInput, PutFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[PutFileInput, PutFileOutput] = js.native
  }
}
