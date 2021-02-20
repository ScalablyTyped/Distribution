package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureDetails extends StObject {
  
  /**
    * The external ID of the run of the action that failed.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  
  /**
    * The message about the failure.
    */
  var message: Message = js.native
  
  /**
    * The type of the failure.
    */
  var `type`: FailureType = js.native
}
object FailureDetails {
  
  @scala.inline
  def apply(message: Message, `type`: FailureType): FailureDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDetails]
  }
  
  @scala.inline
  implicit class FailureDetailsMutableBuilder[Self <: FailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalExecutionId(value: ExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FailureType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
