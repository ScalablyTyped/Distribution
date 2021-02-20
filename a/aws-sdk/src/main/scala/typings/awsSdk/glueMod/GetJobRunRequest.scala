package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobRunRequest extends StObject {
  
  /**
    * Name of the job definition being run.
    */
  var JobName: NameString = js.native
  
  /**
    * True if a list of predecessor runs should be returned.
    */
  var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.native
  
  /**
    * The ID of the job run.
    */
  var RunId: IdString = js.native
}
object GetJobRunRequest {
  
  @scala.inline
  def apply(JobName: NameString, RunId: IdString): GetJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunRequest]
  }
  
  @scala.inline
  implicit class GetJobRunRequestMutableBuilder[Self <: GetJobRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredecessorsIncluded(value: BooleanValue): Self = StObject.set(x, "PredecessorsIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredecessorsIncludedUndefined: Self = StObject.set(x, "PredecessorsIncluded", js.undefined)
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
