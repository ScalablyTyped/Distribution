package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput
import typings.awsSdkClientKmsBrowser.typesGetParametersForImportOutputMod.GetParametersForImportOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getParametersForImportCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GetParametersForImportCommand", "GetParametersForImportCommand")
  @js.native
  class GetParametersForImportCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetParametersForImportInput, 
          OutputTypesUnion, 
          GetParametersForImportOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GetParametersForImportInput) = this()
    
    /* CompleteClass */
    override val input: GetParametersForImportInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetParametersForImportInput, GetParametersForImportOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
  }
}
