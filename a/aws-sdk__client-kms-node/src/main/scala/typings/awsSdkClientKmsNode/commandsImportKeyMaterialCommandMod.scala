package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
import typings.awsSdkClientKmsNode.typesImportKeyMaterialOutputMod.ImportKeyMaterialOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsImportKeyMaterialCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ImportKeyMaterialCommand", "ImportKeyMaterialCommand")
  @js.native
  open class ImportKeyMaterialCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ImportKeyMaterialInput, 
          OutputTypesUnion, 
          ImportKeyMaterialOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ImportKeyMaterialInput) = this()
    
    /* CompleteClass */
    override val input: ImportKeyMaterialInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
  }
}
