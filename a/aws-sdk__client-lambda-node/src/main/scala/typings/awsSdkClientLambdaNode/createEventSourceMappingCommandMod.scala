package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingOutputMod.CreateEventSourceMappingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateEventSourceMappingCommand", JSImport.Namespace)
@js.native
object createEventSourceMappingCommandMod extends js.Object {
  @js.native
  class CreateEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          CreateEventSourceMappingInput, 
          OutputTypesUnion, 
          CreateEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateEventSourceMappingInput) = this()
    val middlewareStack: MiddlewareStack[CreateEventSourceMappingInput, CreateEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
  }
  
}

