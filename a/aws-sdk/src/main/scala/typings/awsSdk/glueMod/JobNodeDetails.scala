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
  
  inline def apply(): JobNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobNodeDetails]
  }
  
  extension [Self <: JobNodeDetails](x: Self) {
    
    inline def setJobRuns(value: JobRunList): Self = StObject.set(x, "JobRuns", value.asInstanceOf[js.Any])
    
    inline def setJobRunsUndefined: Self = StObject.set(x, "JobRuns", js.undefined)
    
    inline def setJobRunsVarargs(value: JobRun*): Self = StObject.set(x, "JobRuns", js.Array(value*))
  }
}
