package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typings.awsSdkClientGlacierNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsAddTagsToVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/AddTagsToVaultCommand", "AddTagsToVaultCommand")
  @js.native
  open class AddTagsToVaultCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          AddTagsToVaultInput, 
          OutputTypesUnion, 
          AddTagsToVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: AddTagsToVaultInput) = this()
    
    /* CompleteClass */
    override val input: AddTagsToVaultInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[AddTagsToVaultInput, AddTagsToVaultOutput] = js.native
  }
}
