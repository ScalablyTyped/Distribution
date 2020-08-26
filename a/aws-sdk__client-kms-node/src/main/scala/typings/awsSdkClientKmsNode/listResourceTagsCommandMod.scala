package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
import typings.awsSdkClientKmsNode.typesListResourceTagsOutputMod.ListResourceTagsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListResourceTagsCommand", JSImport.Namespace)
@js.native
object listResourceTagsCommandMod extends js.Object {
  @js.native
  class ListResourceTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListResourceTagsInput, 
          OutputTypesUnion, 
          ListResourceTagsOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListResourceTagsInput) = this()
    val middlewareStack: MiddlewareStack[ListResourceTagsInput, ListResourceTagsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
  }
  
}

