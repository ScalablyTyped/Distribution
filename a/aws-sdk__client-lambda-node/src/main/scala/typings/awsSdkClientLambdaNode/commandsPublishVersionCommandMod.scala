package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
import typings.awsSdkClientLambdaNode.typesPublishVersionOutputMod.PublishVersionOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPublishVersionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/PublishVersionCommand", "PublishVersionCommand")
  @js.native
  open class PublishVersionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PublishVersionInput, 
          OutputTypesUnion, 
          PublishVersionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: PublishVersionInput) = this()
    
    /* CompleteClass */
    override val input: PublishVersionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PublishVersionInput, PublishVersionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
  }
}
