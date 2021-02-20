package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
import typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateRepositoryDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryDescriptionCommand", "UpdateRepositoryDescriptionCommand")
  @js.native
  class UpdateRepositoryDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateRepositoryDescriptionInput, 
          OutputTypesUnion, 
          UpdateRepositoryDescriptionOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateRepositoryDescriptionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
  }
}
