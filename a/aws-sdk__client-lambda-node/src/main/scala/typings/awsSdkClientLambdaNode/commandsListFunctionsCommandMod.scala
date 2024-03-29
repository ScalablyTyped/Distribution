package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typings.awsSdkClientLambdaNode.typesListFunctionsOutputMod.ListFunctionsOutput
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListFunctionsCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListFunctionsCommand", "ListFunctionsCommand")
  @js.native
  open class ListFunctionsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListFunctionsInput, 
          OutputTypesUnion, 
          ListFunctionsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListFunctionsInput) = this()
    
    /* CompleteClass */
    override val input: ListFunctionsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListFunctionsInput, ListFunctionsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
  }
}
