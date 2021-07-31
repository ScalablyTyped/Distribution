package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMessageVisibilityBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityBatchCommand", "ChangeMessageVisibilityBatchCommand")
  @js.native
  class ChangeMessageVisibilityBatchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ChangeMessageVisibilityBatchInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityBatchOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ChangeMessageVisibilityBatchInput) = this()
    
    /* CompleteClass */
    override val input: ChangeMessageVisibilityBatchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: js.Any
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
  }
}
