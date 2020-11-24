package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
import typings.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageCommand", JSImport.Namespace)
@js.native
object deleteMessageCommandMod extends js.Object {
  
  @js.native
  class DeleteMessageCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageInput, 
          OutputTypesUnion, 
          DeleteMessageOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteMessageInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
  }
}
