package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetJobsResponse extends StObject {
  
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.native
  
  /**
    * A list of names of jobs not found.
    */
  var JobsNotFound: js.UndefOr[JobNameList] = js.native
}
object BatchGetJobsResponse {
  
  @scala.inline
  def apply(): BatchGetJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetJobsResponse]
  }
  
  @scala.inline
  implicit class BatchGetJobsResponseMutableBuilder[Self <: BatchGetJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: JobList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsNotFound(value: JobNameList): Self = StObject.set(x, "JobsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsNotFoundUndefined: Self = StObject.set(x, "JobsNotFound", js.undefined)
    
    @scala.inline
    def setJobsNotFoundVarargs(value: NameString*): Self = StObject.set(x, "JobsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
  }
}
