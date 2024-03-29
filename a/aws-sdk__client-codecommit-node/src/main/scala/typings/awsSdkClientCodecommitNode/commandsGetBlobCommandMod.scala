package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
import typings.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBlobCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetBlobCommand", "GetBlobCommand")
  @js.native
  open class GetBlobCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
  }
}
