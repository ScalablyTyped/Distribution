package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchGetRepositoriesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/BatchGetRepositoriesCommand", "BatchGetRepositoriesCommand")
  @js.native
  class BatchGetRepositoriesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          BatchGetRepositoriesInput, 
          OutputTypesUnion, 
          BatchGetRepositoriesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: BatchGetRepositoriesInput) = this()
    
    /* CompleteClass */
    override val input: BatchGetRepositoriesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
  }
}
