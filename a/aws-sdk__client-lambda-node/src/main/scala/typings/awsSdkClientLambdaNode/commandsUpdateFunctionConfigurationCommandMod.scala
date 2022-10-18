package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationOutputMod.UpdateFunctionConfigurationOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateFunctionConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionConfigurationCommand", "UpdateFunctionConfigurationCommand")
  @js.native
  open class UpdateFunctionConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateFunctionConfigurationInput, 
          OutputTypesUnion, 
          UpdateFunctionConfigurationOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateFunctionConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: UpdateFunctionConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
  }
}
