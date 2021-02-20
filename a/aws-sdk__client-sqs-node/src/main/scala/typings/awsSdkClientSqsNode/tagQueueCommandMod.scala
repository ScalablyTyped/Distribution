package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
import typings.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/TagQueueCommand", "TagQueueCommand")
  @js.native
  class TagQueueCommand protected () extends Command[
          InputTypesUnion, 
          TagQueueInput, 
          OutputTypesUnion, 
          TagQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: TagQueueInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
  }
}
