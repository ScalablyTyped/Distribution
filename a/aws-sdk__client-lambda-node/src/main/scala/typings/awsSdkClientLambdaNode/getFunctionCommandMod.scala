package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
import typings.awsSdkClientLambdaNode.typesGetFunctionOutputMod.GetFunctionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionCommand", "GetFunctionCommand")
  @js.native
  class GetFunctionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetFunctionInput, 
          OutputTypesUnion, 
          GetFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetFunctionInput) = this()
    
    /* CompleteClass */
    override val input: GetFunctionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetFunctionInput, GetFunctionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
  }
}
