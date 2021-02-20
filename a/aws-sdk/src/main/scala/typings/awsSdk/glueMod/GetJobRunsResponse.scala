package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobRunsResponse extends StObject {
  
  /**
    * A list of job-run metadata objects.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.native
  
  /**
    * A continuation token, if not all requested job runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object GetJobRunsResponse {
  
  @scala.inline
  def apply(): GetJobRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunsResponse]
  }
  
  @scala.inline
  implicit class GetJobRunsResponseMutableBuilder[Self <: GetJobRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobRuns(value: JobRunList): Self = StObject.set(x, "JobRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRunsUndefined: Self = StObject.set(x, "JobRuns", js.undefined)
    
    @scala.inline
    def setJobRunsVarargs(value: JobRun*): Self = StObject.set(x, "JobRuns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
