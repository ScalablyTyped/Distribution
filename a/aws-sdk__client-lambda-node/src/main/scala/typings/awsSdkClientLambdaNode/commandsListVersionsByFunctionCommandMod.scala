package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionOutputMod.ListVersionsByFunctionOutput
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListVersionsByFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListVersionsByFunctionCommand", "ListVersionsByFunctionCommand")
  @js.native
  open class ListVersionsByFunctionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListVersionsByFunctionInput, 
          OutputTypesUnion, 
          ListVersionsByFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListVersionsByFunctionInput) = this()
    
    /* CompleteClass */
    override val input: ListVersionsByFunctionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
  }
}
