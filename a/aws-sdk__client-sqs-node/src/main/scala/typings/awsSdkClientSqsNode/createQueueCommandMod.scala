package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
import typings.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/CreateQueueCommand", JSImport.Namespace)
@js.native
object createQueueCommandMod extends js.Object {
  
  @js.native
  class CreateQueueCommand protected () extends Command[
          InputTypesUnion, 
          CreateQueueInput, 
          OutputTypesUnion, 
          CreateQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: CreateQueueInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
  }
}
