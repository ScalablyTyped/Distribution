package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsOutput extends StObject {
  
  var IsTruncated: js.UndefOr[typings.awsSdk.importexportMod.IsTruncated] = js.native
  
  var Jobs: js.UndefOr[JobsList] = js.native
}
object ListJobsOutput {
  
  @scala.inline
  def apply(): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsOutput]
  }
  
  @scala.inline
  implicit class ListJobsOutputMutableBuilder[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setJobs(value: JobsList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value :_*))
  }
}
