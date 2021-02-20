package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsResult extends StObject {
  
  /**
    * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
    */
  var JobListEntries: js.UndefOr[JobListEntryList] = js.native
  
  /**
    * HTTP requests are stateless. If you use this automatically generated NextToken value in your next ListJobs call, your returned JobListEntry objects will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    def setJobListEntries(value: JobListEntryList): Self = StObject.set(x, "JobListEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobListEntriesUndefined: Self = StObject.set(x, "JobListEntries", js.undefined)
    
    @scala.inline
    def setJobListEntriesVarargs(value: JobListEntry*): Self = StObject.set(x, "JobListEntries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
