package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobNodeDetails extends StObject {
  
  /**
    * The information for the job runs represented by the job node.
    */
  var JobRuns: js.UndefOr[JobRunList] = js.undefined
}
object JobNodeDetails {
  
  @scala.inline
  def apply(): JobNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobNodeDetails]
  }
  
  @scala.inline
  implicit class JobNodeDetailsMutableBuilder[Self <: JobNodeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobRuns(value: JobRunList): Self = StObject.set(x, "JobRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRunsUndefined: Self = StObject.set(x, "JobRuns", js.undefined)
    
    @scala.inline
    def setJobRunsVarargs(value: JobRun*): Self = StObject.set(x, "JobRuns", js.Array(value :_*))
  }
}
