package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
import typings.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsReceiveMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ReceiveMessageCommand", "ReceiveMessageCommand")
  @js.native
  open class ReceiveMessageCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ReceiveMessageInput, 
          OutputTypesUnion, 
          ReceiveMessageOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ReceiveMessageInput) = this()
    
    /* CompleteClass */
    override val input: ReceiveMessageInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ReceiveMessageInput, ReceiveMessageOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
  }
}
