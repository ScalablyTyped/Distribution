package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typings.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod.ListEventSourceMappingsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listEventSourceMappingsCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListEventSourceMappingsCommand", "ListEventSourceMappingsCommand")
  @js.native
  class ListEventSourceMappingsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListEventSourceMappingsInput, 
          OutputTypesUnion, 
          ListEventSourceMappingsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListEventSourceMappingsInput) = this()
    
    /* CompleteClass */
    override val input: ListEventSourceMappingsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
  }
}
