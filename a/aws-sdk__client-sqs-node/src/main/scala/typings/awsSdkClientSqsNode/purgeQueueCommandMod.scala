package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
import typings.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purgeQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", "PurgeQueueCommand")
  @js.native
  open class PurgeQueueCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PurgeQueueInput, 
          OutputTypesUnion, 
          PurgeQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: PurgeQueueInput) = this()
    
    /* CompleteClass */
    override val input: PurgeQueueInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PurgeQueueInput, PurgeQueueOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  }
}
