package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
import typings.awsSdkClientLambdaNode.typesGetAliasOutputMod.GetAliasOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAliasCommand", JSImport.Namespace)
@js.native
object getAliasCommandMod extends js.Object {
  @js.native
  class GetAliasCommand protected () extends Command[
          InputTypesUnion, 
          GetAliasInput, 
          OutputTypesUnion, 
          GetAliasOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetAliasInput) = this()
    val middlewareStack: MiddlewareStack[GetAliasInput, GetAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
  }
  
}

