package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
import typings.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSetQueueAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/SetQueueAttributesCommand", "SetQueueAttributesCommand")
  @js.native
  open class SetQueueAttributesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SetQueueAttributesInput, 
          OutputTypesUnion, 
          SetQueueAttributesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: SetQueueAttributesInput) = this()
    
    /* CompleteClass */
    override val input: SetQueueAttributesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
  }
}
