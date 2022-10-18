package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteMessageBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", "DeleteMessageBatchCommand")
  @js.native
  open class DeleteMessageBatchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteMessageBatchInput, 
          OutputTypesUnion, 
          DeleteMessageBatchOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteMessageBatchInput) = this()
    
    /* CompleteClass */
    override val input: DeleteMessageBatchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  }
}
