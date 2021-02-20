package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
import typings.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/SendMessageCommand", "SendMessageCommand")
  @js.native
  class SendMessageCommand protected () extends Command[
          InputTypesUnion, 
          SendMessageInput, 
          OutputTypesUnion, 
          SendMessageOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: SendMessageInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageInput, SendMessageOutput] = js.native
  }
}
