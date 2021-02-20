package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
import typings.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFolderCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetFolderCommand", "GetFolderCommand")
  @js.native
  class GetFolderCommand protected () extends Command[
          InputTypesUnion, 
          GetFolderInput, 
          OutputTypesUnion, 
          GetFolderOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetFolderInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
  }
}
