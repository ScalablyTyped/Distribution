package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
import typings.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSendMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/SendMessageCommand", "SendMessageCommand")
  @js.native
  open class SendMessageCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SendMessageInput, 
          OutputTypesUnion, 
          SendMessageOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: SendMessageInput) = this()
    
    /* CompleteClass */
    override val input: SendMessageInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SendMessageInput, SendMessageOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageInput, SendMessageOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[SendMessageInput, SendMessageOutput] = js.native
  }
}
