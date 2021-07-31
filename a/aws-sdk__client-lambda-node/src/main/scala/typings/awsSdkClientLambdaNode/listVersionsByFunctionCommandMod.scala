package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typings.awsSdkClientLambdaNode.typesListVersionsByFunctionOutputMod.ListVersionsByFunctionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listVersionsByFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListVersionsByFunctionCommand", "ListVersionsByFunctionCommand")
  @js.native
  class ListVersionsByFunctionCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
  }
}
