package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typings.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMessageBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/SendMessageBatchCommand", "SendMessageBatchCommand")
  @js.native
  class SendMessageBatchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SendMessageBatchInput, 
          OutputTypesUnion, 
          SendMessageBatchOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: SendMessageBatchInput) = this()
    
    /* CompleteClass */
    override val input: SendMessageBatchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SendMessageBatchInput, SendMessageBatchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: js.Any
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  }
}
