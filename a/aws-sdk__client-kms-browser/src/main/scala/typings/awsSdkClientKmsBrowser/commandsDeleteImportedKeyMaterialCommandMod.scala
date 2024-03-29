package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialOutputMod.DeleteImportedKeyMaterialOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteImportedKeyMaterialCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DeleteImportedKeyMaterialCommand", "DeleteImportedKeyMaterialCommand")
  @js.native
  open class DeleteImportedKeyMaterialCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteImportedKeyMaterialInput, 
          OutputTypesUnion, 
          DeleteImportedKeyMaterialOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DeleteImportedKeyMaterialInput) = this()
    
    /* CompleteClass */
    override val input: DeleteImportedKeyMaterialInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
  }
}
