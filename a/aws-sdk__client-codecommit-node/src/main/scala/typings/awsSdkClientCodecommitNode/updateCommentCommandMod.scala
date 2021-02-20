package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
import typings.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateCommentCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateCommentCommand", "UpdateCommentCommand")
  @js.native
  class UpdateCommentCommand protected () extends Command[
          InputTypesUnion, 
          UpdateCommentInput, 
          OutputTypesUnion, 
          UpdateCommentOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateCommentInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
  }
}
