package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
import typings.awsSdkClientLambdaNode.typesDeleteAliasOutputMod.DeleteAliasOutput
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteAliasCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/DeleteAliasCommand", "DeleteAliasCommand")
  @js.native
  open class DeleteAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteAliasInput, 
          OutputTypesUnion, 
          DeleteAliasOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: DeleteAliasInput) = this()
    
    /* CompleteClass */
    override val input: DeleteAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteAliasInput, DeleteAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  }
}
