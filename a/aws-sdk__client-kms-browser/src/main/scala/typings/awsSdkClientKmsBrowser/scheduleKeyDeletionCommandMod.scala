package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionOutputMod.ScheduleKeyDeletionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ScheduleKeyDeletionCommand", JSImport.Namespace)
@js.native
object scheduleKeyDeletionCommandMod extends js.Object {
  @js.native
  class ScheduleKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          ScheduleKeyDeletionInput, 
          OutputTypesUnion, 
          ScheduleKeyDeletionOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ScheduleKeyDeletionInput) = this()
    /* CompleteClass */
    override val input: ScheduleKeyDeletionInput = js.native
    val middlewareStack: MiddlewareStack[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
  }
  
}

