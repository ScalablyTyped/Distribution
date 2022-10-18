package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typings.awsSdkClientLambdaNode.typesListTagsOutputMod.ListTagsOutput
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListTagsCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListTagsCommand", "ListTagsCommand")
  @js.native
  open class ListTagsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListTagsInput, 
          OutputTypesUnion, 
          ListTagsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListTagsInput) = this()
    
    /* CompleteClass */
    override val input: ListTagsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListTagsInput, ListTagsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
  }
}
