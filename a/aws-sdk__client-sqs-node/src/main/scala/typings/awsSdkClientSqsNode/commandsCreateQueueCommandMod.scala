package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
import typings.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/CreateQueueCommand", "CreateQueueCommand")
  @js.native
  open class CreateQueueCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateQueueInput, 
          OutputTypesUnion, 
          CreateQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: CreateQueueInput) = this()
    
    /* CompleteClass */
    override val input: CreateQueueInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateQueueInput, CreateQueueOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
  }
}
