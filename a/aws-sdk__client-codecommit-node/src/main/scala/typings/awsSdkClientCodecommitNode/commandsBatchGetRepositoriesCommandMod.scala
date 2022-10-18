package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
import typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsBatchGetRepositoriesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/BatchGetRepositoriesCommand", "BatchGetRepositoriesCommand")
  @js.native
  open class BatchGetRepositoriesCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
  }
}
