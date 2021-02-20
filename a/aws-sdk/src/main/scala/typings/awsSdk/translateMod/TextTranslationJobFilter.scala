package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTranslationJobFilter extends StObject {
  
  /**
    * Filters the list of jobs by name.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.native
  
  /**
    * Filters the list of jobs based by job status.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmittedAfterTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmittedBeforeTime: js.UndefOr[Timestamp] = js.native
}
object TextTranslationJobFilter {
  
  @scala.inline
  def apply(): TextTranslationJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobFilter]
  }
  
  @scala.inline
  implicit class TextTranslationJobFilterMutableBuilder[Self <: TextTranslationJobFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setSubmittedAfterTime(value: Timestamp): Self = StObject.set(x, "SubmittedAfterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedAfterTimeUndefined: Self = StObject.set(x, "SubmittedAfterTime", js.undefined)
    
    @scala.inline
    def setSubmittedBeforeTime(value: Timestamp): Self = StObject.set(x, "SubmittedBeforeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedBeforeTimeUndefined: Self = StObject.set(x, "SubmittedBeforeTime", js.undefined)
  }
}
