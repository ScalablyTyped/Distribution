package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typings.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod.ListEventSourceMappingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListEventSourceMappingsCommand", JSImport.Namespace)
@js.native
object listEventSourceMappingsCommandMod extends js.Object {
  @js.native
  class ListEventSourceMappingsCommand protected () extends Command[
          InputTypesUnion, 
          ListEventSourceMappingsInput, 
          OutputTypesUnion, 
          ListEventSourceMappingsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListEventSourceMappingsInput) = this()
    /* CompleteClass */
    override val input: ListEventSourceMappingsInput = js.native
    val middlewareStack: MiddlewareStack[ListEventSourceMappingsInput, ListEventSourceMappingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
  }
  
}

