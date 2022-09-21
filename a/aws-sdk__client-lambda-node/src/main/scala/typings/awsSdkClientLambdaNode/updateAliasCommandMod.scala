package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
import typings.awsSdkClientLambdaNode.typesUpdateAliasOutputMod.UpdateAliasOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateAliasCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/UpdateAliasCommand", "UpdateAliasCommand")
  @js.native
  open class UpdateAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateAliasInput, 
          OutputTypesUnion, 
          UpdateAliasOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateAliasInput) = this()
    
    /* CompleteClass */
    override val input: UpdateAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateAliasInput, UpdateAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
  }
}
