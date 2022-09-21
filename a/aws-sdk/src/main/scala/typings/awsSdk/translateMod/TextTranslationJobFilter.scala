package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTranslationJobFilter extends StObject {
  
  /**
    * Filters the list of jobs by name.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.undefined
  
  /**
    * Filters the list of jobs based by job status.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.undefined
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmittedAfterTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmittedBeforeTime: js.UndefOr[js.Date] = js.undefined
}
object TextTranslationJobFilter {
  
  inline def apply(): TextTranslationJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobFilter]
  }
  
  extension [Self <: TextTranslationJobFilter](x: Self) {
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setSubmittedAfterTime(value: js.Date): Self = StObject.set(x, "SubmittedAfterTime", value.asInstanceOf[js.Any])
    
    inline def setSubmittedAfterTimeUndefined: Self = StObject.set(x, "SubmittedAfterTime", js.undefined)
    
    inline def setSubmittedBeforeTime(value: js.Date): Self = StObject.set(x, "SubmittedBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setSubmittedBeforeTimeUndefined: Self = StObject.set(x, "SubmittedBeforeTime", js.undefined)
  }
}
