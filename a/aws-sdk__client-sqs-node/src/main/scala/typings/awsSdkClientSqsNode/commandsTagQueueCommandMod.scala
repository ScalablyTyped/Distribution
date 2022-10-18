package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
import typings.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsTagQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/TagQueueCommand", "TagQueueCommand")
  @js.native
  open class TagQueueCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          TagQueueInput, 
          OutputTypesUnion, 
          TagQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: TagQueueInput) = this()
    
    /* CompleteClass */
    override val input: TagQueueInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[TagQueueInput, TagQueueOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
  }
}
