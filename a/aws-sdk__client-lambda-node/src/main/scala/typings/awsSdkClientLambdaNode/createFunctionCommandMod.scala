package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
import typings.awsSdkClientLambdaNode.typesCreateFunctionOutputMod.CreateFunctionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFunctionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/CreateFunctionCommand", "CreateFunctionCommand")
  @js.native
  class CreateFunctionCommand protected () extends Command[
          InputTypesUnion, 
          CreateFunctionInput, 
          OutputTypesUnion, 
          CreateFunctionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: CreateFunctionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
  }
}
