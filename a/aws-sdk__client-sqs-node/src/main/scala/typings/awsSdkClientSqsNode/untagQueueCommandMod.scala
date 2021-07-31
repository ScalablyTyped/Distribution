package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
import typings.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object untagQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/UntagQueueCommand", "UntagQueueCommand")
  @js.native
  class UntagQueueCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UntagQueueInput, 
          OutputTypesUnion, 
          UntagQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: UntagQueueInput) = this()
    
    /* CompleteClass */
    override val input: UntagQueueInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UntagQueueInput, UntagQueueOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: js.Any
    ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
  }
}
