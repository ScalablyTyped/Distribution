package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
import typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDifferencesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetDifferencesCommand", "GetDifferencesCommand")
  @js.native
  open class GetDifferencesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetDifferencesInput, 
          OutputTypesUnion, 
          GetDifferencesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetDifferencesInput) = this()
    
    /* CompleteClass */
    override val input: GetDifferencesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetDifferencesInput, GetDifferencesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
  }
}
