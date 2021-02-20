package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSoftwareUpdatesRequest extends StObject {
  
  /**
    * The ID for a job that you want to get the software update file for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId = js.native
}
object GetSoftwareUpdatesRequest {
  
  @scala.inline
  def apply(JobId: JobId): GetSoftwareUpdatesRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSoftwareUpdatesRequest]
  }
  
  @scala.inline
  implicit class GetSoftwareUpdatesRequestMutableBuilder[Self <: GetSoftwareUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
