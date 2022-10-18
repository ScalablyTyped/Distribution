package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
import typings.awsSdkClientLambdaNode.typesDeleteFunctionOutputMod.DeleteFunctionOutput
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionCommand", "DeleteFunctionCommand")
  @js.native
  open class DeleteFunctionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteFunctionInput, 
          OutputTypesUnion, 
          DeleteFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteFunctionInput) = this()
    
    /* CompleteClass */
    override val input: DeleteFunctionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteFunctionInput, DeleteFunctionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
  }
}
