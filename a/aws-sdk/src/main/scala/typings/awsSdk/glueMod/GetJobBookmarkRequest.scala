package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobBookmarkRequest extends StObject {
  
  /**
    * The name of the job in question.
    */
  var JobName: typings.awsSdk.glueMod.JobName = js.native
  
  /**
    * The unique run identifier associated with this job run.
    */
  var RunId: js.UndefOr[typings.awsSdk.glueMod.RunId] = js.native
}
object GetJobBookmarkRequest {
  
  @scala.inline
  def apply(JobName: JobName): GetJobBookmarkRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobBookmarkRequest]
  }
  
  @scala.inline
  implicit class GetJobBookmarkRequestMutableBuilder[Self <: GetJobBookmarkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: RunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
