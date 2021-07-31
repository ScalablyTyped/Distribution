package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
import typings.awsSdkClientLambdaNode.typesPublishVersionOutputMod.PublishVersionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishVersionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/PublishVersionCommand", "PublishVersionCommand")
  @js.native
  class PublishVersionCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
  }
}
