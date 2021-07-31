package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingOutputMod.CreateEventSourceMappingOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/CreateEventSourceMappingCommand", "CreateEventSourceMappingCommand")
  @js.native
  class CreateEventSourceMappingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateEventSourceMappingInput, 
          OutputTypesUnion, 
          CreateEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: CreateEventSourceMappingInput) = this()
    
    /* CompleteClass */
    override val input: CreateEventSourceMappingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
  }
}
