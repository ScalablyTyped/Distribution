package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
import typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusOutputMod.GetKeyRotationStatusOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetKeyRotationStatusCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GetKeyRotationStatusCommand", "GetKeyRotationStatusCommand")
  @js.native
  open class GetKeyRotationStatusCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetKeyRotationStatusInput, 
          OutputTypesUnion, 
          GetKeyRotationStatusOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GetKeyRotationStatusInput) = this()
    
    /* CompleteClass */
    override val input: GetKeyRotationStatusInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
  }
}
