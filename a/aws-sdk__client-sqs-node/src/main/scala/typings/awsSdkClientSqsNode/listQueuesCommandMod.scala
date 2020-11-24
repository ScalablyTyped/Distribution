package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
import typings.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs-node/commands/ListQueuesCommand", JSImport.Namespace)
@js.native
object listQueuesCommandMod extends js.Object {
  
  @js.native
  class ListQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListQueuesInput, 
          OutputTypesUnion, 
          ListQueuesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ListQueuesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
  }
}
