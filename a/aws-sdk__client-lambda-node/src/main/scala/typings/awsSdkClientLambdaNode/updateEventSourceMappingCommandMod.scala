package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingOutputMod.UpdateEventSourceMappingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateEventSourceMappingCommand", JSImport.Namespace)
@js.native
object updateEventSourceMappingCommandMod extends js.Object {
  @js.native
  class UpdateEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEventSourceMappingInput, 
          OutputTypesUnion, 
          UpdateEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateEventSourceMappingInput) = this()
    val middlewareStack: MiddlewareStack[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
  }
  
}

