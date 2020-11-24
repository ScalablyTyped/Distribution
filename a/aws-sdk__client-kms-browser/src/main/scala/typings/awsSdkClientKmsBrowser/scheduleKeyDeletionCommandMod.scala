package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionOutputMod.ScheduleKeyDeletionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/ScheduleKeyDeletionCommand", JSImport.Namespace)
@js.native
object scheduleKeyDeletionCommandMod extends js.Object {
  
  @js.native
  class ScheduleKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          ScheduleKeyDeletionInput, 
          OutputTypesUnion, 
          ScheduleKeyDeletionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ScheduleKeyDeletionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
  }
}
