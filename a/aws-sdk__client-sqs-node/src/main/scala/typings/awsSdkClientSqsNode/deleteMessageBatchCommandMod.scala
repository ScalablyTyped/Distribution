package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", JSImport.Namespace)
@js.native
object deleteMessageBatchCommandMod extends js.Object {
  
  @js.native
  class DeleteMessageBatchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageBatchInput, 
          OutputTypesUnion, 
          DeleteMessageBatchOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteMessageBatchInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  }
}
