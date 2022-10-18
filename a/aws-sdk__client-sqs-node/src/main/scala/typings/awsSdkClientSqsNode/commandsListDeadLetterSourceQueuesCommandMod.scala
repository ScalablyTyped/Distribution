package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
import typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListDeadLetterSourceQueuesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ListDeadLetterSourceQueuesCommand", "ListDeadLetterSourceQueuesCommand")
  @js.native
  open class ListDeadLetterSourceQueuesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListDeadLetterSourceQueuesInput, 
          OutputTypesUnion, 
          ListDeadLetterSourceQueuesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ListDeadLetterSourceQueuesInput) = this()
    
    /* CompleteClass */
    override val input: ListDeadLetterSourceQueuesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
  }
}
