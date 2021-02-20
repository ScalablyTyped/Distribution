package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsResult extends StObject {
  
  /**
    * The list of current jobs and jobs that have ended within the last 30 days.
    */
  var Jobs: js.UndefOr[JobListDescriptorList] = js.native
  
  /**
    * If the List Jobs request produced more than the maximum number of results, you can pass this value into a subsequent List Jobs request in order to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[StringForNextToken] = js.native
}
object ListJobsResult {
  
  @scala.inline
  def apply(): ListJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResult]
  }
  
  @scala.inline
  implicit class ListJobsResultMutableBuilder[Self <: ListJobsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: JobListDescriptorList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: JobListDescriptor*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: StringForNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
