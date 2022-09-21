package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingOutputMod.DeleteEventSourceMappingOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteEventSourceMappingCommand", "DeleteEventSourceMappingCommand")
  @js.native
  open class DeleteEventSourceMappingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteEventSourceMappingInput, 
          OutputTypesUnion, 
          DeleteEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteEventSourceMappingInput) = this()
    
    /* CompleteClass */
    override val input: DeleteEventSourceMappingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
  }
}
