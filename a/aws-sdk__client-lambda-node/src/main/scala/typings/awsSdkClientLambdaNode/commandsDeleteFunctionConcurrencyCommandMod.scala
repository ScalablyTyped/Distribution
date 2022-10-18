package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyOutputMod.DeleteFunctionConcurrencyOutput
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteFunctionConcurrencyCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionConcurrencyCommand", "DeleteFunctionConcurrencyCommand")
  @js.native
  open class DeleteFunctionConcurrencyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteFunctionConcurrencyInput, 
          OutputTypesUnion, 
          DeleteFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteFunctionConcurrencyInput) = this()
    
    /* CompleteClass */
    override val input: DeleteFunctionConcurrencyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
  }
}
