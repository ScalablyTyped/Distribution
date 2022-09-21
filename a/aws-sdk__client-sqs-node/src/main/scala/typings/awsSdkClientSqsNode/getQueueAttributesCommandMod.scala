package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
import typings.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueueAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/GetQueueAttributesCommand", "GetQueueAttributesCommand")
  @js.native
  open class GetQueueAttributesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetQueueAttributesInput, 
          OutputTypesUnion, 
          GetQueueAttributesOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: GetQueueAttributesInput) = this()
    
    /* CompleteClass */
    override val input: GetQueueAttributesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
  }
}
