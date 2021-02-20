package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
import typings.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PutFileCommand", "PutFileCommand")
  @js.native
  class PutFileCommand protected () extends Command[
          InputTypesUnion, 
          PutFileInput, 
          OutputTypesUnion, 
          PutFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PutFileInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutFileInput, PutFileOutput] = js.native
  }
}
