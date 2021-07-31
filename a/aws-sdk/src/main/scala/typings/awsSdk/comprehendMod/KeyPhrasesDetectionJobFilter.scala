package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPhrasesDetectionJobFilter extends StObject {
  
  /**
    * Filters on the name of the job.
    */
  var JobName: js.UndefOr[typings.awsSdk.comprehendMod.JobName] = js.undefined
  
  /**
    * Filters the list of jobs based on job status. Returns only jobs with the specified status.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendMod.JobStatus] = js.undefined
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
}
object KeyPhrasesDetectionJobFilter {
  
  @scala.inline
  def apply(): KeyPhrasesDetectionJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPhrasesDetectionJobFilter]
  }
  
  @scala.inline
  implicit class KeyPhrasesDetectionJobFilterMutableBuilder[Self <: KeyPhrasesDetectionJobFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setSubmitTimeAfter(value: Timestamp): Self = StObject.set(x, "SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeAfterUndefined: Self = StObject.set(x, "SubmitTimeAfter", js.undefined)
    
    @scala.inline
    def setSubmitTimeBefore(value: Timestamp): Self = StObject.set(x, "SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeBeforeUndefined: Self = StObject.set(x, "SubmitTimeBefore", js.undefined)
  }
}
