package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
import typings.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageCommand", "DeleteMessageCommand")
  @js.native
  open class DeleteMessageCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteMessageInput, 
          OutputTypesUnion, 
          DeleteMessageOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteMessageInput) = this()
    
    /* CompleteClass */
    override val input: DeleteMessageInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteMessageInput, DeleteMessageOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
  }
}
