package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
import typings.awsSdkClientLambdaNode.typesGetAliasOutputMod.GetAliasOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAliasCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetAliasCommand", "GetAliasCommand")
  @js.native
  open class GetAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetAliasInput, 
          OutputTypesUnion, 
          GetAliasOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetAliasInput) = this()
    
    /* CompleteClass */
    override val input: GetAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetAliasInput, GetAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
  }
}
