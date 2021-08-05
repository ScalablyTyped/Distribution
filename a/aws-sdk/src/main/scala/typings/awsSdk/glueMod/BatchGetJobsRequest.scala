package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetJobsRequest extends StObject {
  
  /**
    * A list of job names, which might be the names returned from the ListJobs operation.
    */
  var JobNames: JobNameList
}
object BatchGetJobsRequest {
  
  inline def apply(JobNames: JobNameList): BatchGetJobsRequest = {
    val __obj = js.Dynamic.literal(JobNames = JobNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetJobsRequest]
  }
  
  extension [Self <: BatchGetJobsRequest](x: Self) {
    
    inline def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    inline def setJobNamesVarargs(value: NameString*): Self = StObject.set(x, "JobNames", js.Array(value :_*))
  }
}
