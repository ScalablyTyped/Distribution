package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
import typings.awsSdkClientLambdaNode.typesCreateFunctionOutputMod.CreateFunctionOutput
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/CreateFunctionCommand", "CreateFunctionCommand")
  @js.native
  open class CreateFunctionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateFunctionInput, 
          OutputTypesUnion, 
          CreateFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: CreateFunctionInput) = this()
    
    /* CompleteClass */
    override val input: CreateFunctionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateFunctionInput, CreateFunctionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
  }
}
