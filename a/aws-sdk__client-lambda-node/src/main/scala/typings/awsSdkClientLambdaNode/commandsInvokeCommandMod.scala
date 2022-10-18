package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
import typings.awsSdkClientLambdaNode.typesInvokeOutputMod.InvokeOutput
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsInvokeCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/InvokeCommand", "InvokeCommand")
  @js.native
  open class InvokeCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          InvokeInput, 
          OutputTypesUnion, 
          InvokeOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: InvokeInput) = this()
    
    /* CompleteClass */
    override val input: InvokeInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[InvokeInput, InvokeOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeInput, InvokeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[InvokeInput, InvokeOutput] = js.native
  }
}
