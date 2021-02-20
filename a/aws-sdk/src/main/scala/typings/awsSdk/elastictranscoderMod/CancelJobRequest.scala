package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJobRequest extends StObject {
  
  /**
    * The identifier of the job that you want to cancel. To get a list of the jobs (including their jobId) that have a status of Submitted, use the ListJobsByStatus API action.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
}
object CancelJobRequest {
  
  @scala.inline
  def apply(Id: Id): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit class CancelJobRequestMutableBuilder[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
