package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesGetEventSourceMappingOutputMod.GetEventSourceMappingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetEventSourceMappingCommand", JSImport.Namespace)
@js.native
object getEventSourceMappingCommandMod extends js.Object {
  @js.native
  class GetEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          GetEventSourceMappingInput, 
          OutputTypesUnion, 
          GetEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetEventSourceMappingInput) = this()
    /* CompleteClass */
    override val input: GetEventSourceMappingInput = js.native
    val middlewareStack: MiddlewareStack[GetEventSourceMappingInput, GetEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
  }
  
}

