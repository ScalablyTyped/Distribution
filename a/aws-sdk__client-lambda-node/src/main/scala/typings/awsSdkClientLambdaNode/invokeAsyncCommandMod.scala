package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typings.awsSdkClientLambdaNode.typesInvokeAsyncOutputMod.InvokeAsyncOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeAsyncCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/InvokeAsyncCommand", "InvokeAsyncCommand")
  @js.native
  class InvokeAsyncCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          InvokeAsyncInput[Readable], 
          OutputTypesUnion, 
          InvokeAsyncOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: InvokeAsyncInput[Readable]) = this()
    
    /* CompleteClass */
    override val input: InvokeAsyncInput[Readable] = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
  }
}
