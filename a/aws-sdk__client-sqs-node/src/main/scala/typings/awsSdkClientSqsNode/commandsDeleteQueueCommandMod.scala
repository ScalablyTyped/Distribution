package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
import typings.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/DeleteQueueCommand", "DeleteQueueCommand")
  @js.native
  open class DeleteQueueCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteQueueInput, 
          OutputTypesUnion, 
          DeleteQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: DeleteQueueInput) = this()
    
    /* CompleteClass */
    override val input: DeleteQueueInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteQueueInput, DeleteQueueOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
  }
}
