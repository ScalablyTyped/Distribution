package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
import typings.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMergeConflictsCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetMergeConflictsCommand", "GetMergeConflictsCommand")
  @js.native
  class GetMergeConflictsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetMergeConflictsInput, 
          OutputTypesUnion, 
          GetMergeConflictsOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetMergeConflictsInput) = this()
    
    /* CompleteClass */
    override val input: GetMergeConflictsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
  }
}
