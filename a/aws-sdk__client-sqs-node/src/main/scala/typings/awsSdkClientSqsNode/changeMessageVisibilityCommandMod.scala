package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMessageVisibilityCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityCommand", "ChangeMessageVisibilityCommand")
  @js.native
  class ChangeMessageVisibilityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ChangeMessageVisibilityInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ChangeMessageVisibilityInput) = this()
    
    /* CompleteClass */
    override val input: ChangeMessageVisibilityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: js.Any
    ): Handler[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
  }
}
