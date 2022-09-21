package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
import typings.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueueUrlCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/GetQueueUrlCommand", "GetQueueUrlCommand")
  @js.native
  open class GetQueueUrlCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetQueueUrlInput, 
          OutputTypesUnion, 
          GetQueueUrlOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: GetQueueUrlInput) = this()
    
    /* CompleteClass */
    override val input: GetQueueUrlInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetQueueUrlInput, GetQueueUrlOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
  }
}
