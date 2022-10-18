package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionOutputMod.ScheduleKeyDeletionOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsScheduleKeyDeletionCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ScheduleKeyDeletionCommand", "ScheduleKeyDeletionCommand")
  @js.native
  open class ScheduleKeyDeletionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ScheduleKeyDeletionInput, 
          OutputTypesUnion, 
          ScheduleKeyDeletionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ScheduleKeyDeletionInput) = this()
    
    /* CompleteClass */
    override val input: ScheduleKeyDeletionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
  }
}
