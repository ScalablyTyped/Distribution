package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingOutputMod.UpdateEventSourceMappingOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/UpdateEventSourceMappingCommand", "UpdateEventSourceMappingCommand")
  @js.native
  open class UpdateEventSourceMappingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateEventSourceMappingInput, 
          OutputTypesUnion, 
          UpdateEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateEventSourceMappingInput) = this()
    
    /* CompleteClass */
    override val input: UpdateEventSourceMappingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
  }
}
