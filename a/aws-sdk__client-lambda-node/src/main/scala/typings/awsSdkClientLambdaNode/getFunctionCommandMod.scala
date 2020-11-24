package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
import typings.awsSdkClientLambdaNode.typesGetFunctionOutputMod.GetFunctionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionCommand", JSImport.Namespace)
@js.native
object getFunctionCommandMod extends js.Object {
  
  @js.native
  class GetFunctionCommand protected () extends Command[
          InputTypesUnion, 
          GetFunctionInput, 
          OutputTypesUnion, 
          GetFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: GetFunctionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
  }
}
