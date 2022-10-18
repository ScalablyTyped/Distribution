package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput
import typings.awsSdkClientKmsBrowser.typesDeleteAliasOutputMod.DeleteAliasOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteAliasCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DeleteAliasCommand", "DeleteAliasCommand")
  @js.native
  open class DeleteAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteAliasInput, 
          OutputTypesUnion, 
          DeleteAliasOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DeleteAliasInput) = this()
    
    /* CompleteClass */
    override val input: DeleteAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteAliasInput, DeleteAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  }
}
