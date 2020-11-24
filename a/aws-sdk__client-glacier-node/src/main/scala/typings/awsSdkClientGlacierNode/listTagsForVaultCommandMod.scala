package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typings.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/ListTagsForVaultCommand", JSImport.Namespace)
@js.native
object listTagsForVaultCommandMod extends js.Object {
  
  @js.native
  class ListTagsForVaultCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForVaultInput, 
          OutputTypesUnion, 
          ListTagsForVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListTagsForVaultInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
  }
}
