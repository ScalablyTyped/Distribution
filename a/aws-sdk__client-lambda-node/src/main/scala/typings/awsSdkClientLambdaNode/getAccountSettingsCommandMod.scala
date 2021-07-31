package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typings.awsSdkClientLambdaNode.typesGetAccountSettingsOutputMod.GetAccountSettingsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccountSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/GetAccountSettingsCommand", "GetAccountSettingsCommand")
  @js.native
  class GetAccountSettingsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetAccountSettingsInput, 
          OutputTypesUnion, 
          GetAccountSettingsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetAccountSettingsInput) = this()
    
    /* CompleteClass */
    override val input: GetAccountSettingsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: js.Any
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
  }
}
