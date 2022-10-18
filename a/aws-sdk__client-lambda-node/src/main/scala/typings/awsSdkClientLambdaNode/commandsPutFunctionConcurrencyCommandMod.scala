package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyOutputMod.PutFunctionConcurrencyOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutFunctionConcurrencyCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/PutFunctionConcurrencyCommand", "PutFunctionConcurrencyCommand")
  @js.native
  open class PutFunctionConcurrencyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutFunctionConcurrencyInput, 
          OutputTypesUnion, 
          PutFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: PutFunctionConcurrencyInput) = this()
    
    /* CompleteClass */
    override val input: PutFunctionConcurrencyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
  }
}
