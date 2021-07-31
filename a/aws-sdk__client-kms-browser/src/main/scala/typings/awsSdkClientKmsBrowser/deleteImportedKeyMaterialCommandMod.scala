package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialOutputMod.DeleteImportedKeyMaterialOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteImportedKeyMaterialCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DeleteImportedKeyMaterialCommand", "DeleteImportedKeyMaterialCommand")
  @js.native
  class DeleteImportedKeyMaterialCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
  }
}
