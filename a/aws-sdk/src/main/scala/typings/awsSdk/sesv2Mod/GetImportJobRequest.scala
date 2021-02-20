package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImportJobRequest extends StObject {
  
  /**
    * The ID of the import job.
    */
  var JobId: typings.awsSdk.sesv2Mod.JobId = js.native
}
object GetImportJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): GetImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobRequest]
  }
  
  @scala.inline
  implicit class GetImportJobRequestMutableBuilder[Self <: GetImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
