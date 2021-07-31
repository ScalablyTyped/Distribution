package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesGetEventSourceMappingOutputMod.GetEventSourceMappingOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetEventSourceMappingCommand", "GetEventSourceMappingCommand")
  @js.native
  class GetEventSourceMappingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetEventSourceMappingInput, 
          OutputTypesUnion, 
          GetEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetEventSourceMappingInput) = this()
    
    /* CompleteClass */
    override val input: GetEventSourceMappingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
  }
}
