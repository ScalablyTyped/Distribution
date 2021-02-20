package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobRunResponse extends StObject {
  
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[typings.awsSdk.glueMod.JobRun] = js.native
}
object GetJobRunResponse {
  
  @scala.inline
  def apply(): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunResponse]
  }
  
  @scala.inline
  implicit class GetJobRunResponseMutableBuilder[Self <: GetJobRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobRun(value: JobRun): Self = StObject.set(x, "JobRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRunUndefined: Self = StObject.set(x, "JobRun", js.undefined)
  }
}
