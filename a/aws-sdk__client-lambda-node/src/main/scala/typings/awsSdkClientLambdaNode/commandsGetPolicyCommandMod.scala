package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
import typings.awsSdkClientLambdaNode.typesGetPolicyOutputMod.GetPolicyOutput
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetPolicyCommand", "GetPolicyCommand")
  @js.native
  open class GetPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetPolicyInput, 
          OutputTypesUnion, 
          GetPolicyOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetPolicyInput) = this()
    
    /* CompleteClass */
    override val input: GetPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetPolicyInput, GetPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
  }
}
