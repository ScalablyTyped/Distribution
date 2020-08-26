package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingOutputMod.DeleteEventSourceMappingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteEventSourceMappingCommand", JSImport.Namespace)
@js.native
object deleteEventSourceMappingCommandMod extends js.Object {
  @js.native
  class DeleteEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEventSourceMappingInput, 
          OutputTypesUnion, 
          DeleteEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteEventSourceMappingInput) = this()
    val middlewareStack: MiddlewareStack[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
  }
  
}

