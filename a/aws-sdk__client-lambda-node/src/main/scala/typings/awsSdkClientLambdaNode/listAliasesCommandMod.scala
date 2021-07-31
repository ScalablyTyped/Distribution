package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
import typings.awsSdkClientLambdaNode.typesListAliasesOutputMod.ListAliasesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAliasesCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListAliasesCommand", "ListAliasesCommand")
  @js.native
  class ListAliasesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListAliasesInput) = this()
    
    /* CompleteClass */
    override val input: ListAliasesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListAliasesInput, ListAliasesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
}
