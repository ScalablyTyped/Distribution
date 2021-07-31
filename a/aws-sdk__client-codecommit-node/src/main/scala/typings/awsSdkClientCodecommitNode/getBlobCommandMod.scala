package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
import typings.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBlobCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetBlobCommand", "GetBlobCommand")
  @js.native
  class GetBlobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBlobInput, 
          OutputTypesUnion, 
          GetBlobOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetBlobInput) = this()
    
    /* CompleteClass */
    override val input: GetBlobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBlobInput, GetBlobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
  }
}
