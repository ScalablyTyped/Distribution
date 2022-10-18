package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationOutputMod.GetFunctionConfigurationOutput
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetFunctionConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionConfigurationCommand", "GetFunctionConfigurationCommand")
  @js.native
  open class GetFunctionConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetFunctionConfigurationInput, 
          OutputTypesUnion, 
          GetFunctionConfigurationOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetFunctionConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: GetFunctionConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
  }
}
