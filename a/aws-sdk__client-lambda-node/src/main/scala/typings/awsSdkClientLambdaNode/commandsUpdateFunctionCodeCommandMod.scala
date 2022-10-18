package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
import typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeOutputMod.UpdateFunctionCodeOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateFunctionCodeCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionCodeCommand", "UpdateFunctionCodeCommand")
  @js.native
  open class UpdateFunctionCodeCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateFunctionCodeInput, 
          OutputTypesUnion, 
          UpdateFunctionCodeOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateFunctionCodeInput) = this()
    
    /* CompleteClass */
    override val input: UpdateFunctionCodeInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
  }
}
