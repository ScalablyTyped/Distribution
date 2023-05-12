package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsScheduleKeyDeletionCommandMod.ScheduleKeyDeletionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ScheduleKeyDeletionCommand")
@js.native
open class ScheduleKeyDeletionCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsScheduleKeyDeletionCommandMod.ScheduleKeyDeletionCommand {
  /**
    * @public
    */
  def this(input: ScheduleKeyDeletionCommandInput) = this()
}
/* static members */
object ScheduleKeyDeletionCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ScheduleKeyDeletionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
