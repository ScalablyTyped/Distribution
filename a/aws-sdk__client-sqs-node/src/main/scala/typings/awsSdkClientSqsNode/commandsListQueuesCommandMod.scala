package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
import typings.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListQueuesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ListQueuesCommand", "ListQueuesCommand")
  @js.native
  open class ListQueuesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListQueuesInput, 
          OutputTypesUnion, 
          ListQueuesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ListQueuesInput) = this()
    
    /* CompleteClass */
    override val input: ListQueuesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListQueuesInput, ListQueuesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
  }
}
