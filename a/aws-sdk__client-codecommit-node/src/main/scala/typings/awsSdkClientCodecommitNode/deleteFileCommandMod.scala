package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
import typings.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteFileCommand", JSImport.Namespace)
@js.native
object deleteFileCommandMod extends js.Object {
  
  @js.native
  class DeleteFileCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFileInput, 
          OutputTypesUnion, 
          DeleteFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteFileInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
  }
}
