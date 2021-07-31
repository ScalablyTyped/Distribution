package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationOutputMod.GetFunctionConfigurationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFunctionConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionConfigurationCommand", "GetFunctionConfigurationCommand")
  @js.native
  class GetFunctionConfigurationCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
  }
}
