package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerEnrollmentJobSummary extends StObject {
  
  /**
    * A timestamp showing the creation time of the speaker enrollment job.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the domain that contains the speaker enrollment job.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * A timestamp showing when the speaker enrollment job ended.
    */
  var EndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains details that are populated when an entire batch job fails. In cases of individual registration job failures, the batch job as a whole doesn't fail; it is completed with a JobStatus of COMPLETED_WITH_ERRORS. You can use the job output file to identify the individual registration requests that failed.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.clientsVoiceidMod.FailureDetails] = js.undefined
  
  /**
    * The service-generated identifier for the speaker enrollment job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobId] = js.undefined
  
  /**
    * The client-provided name for the speaker enrollment job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobName] = js.undefined
  
  /**
    * Provides details regarding job progress. This field shows the completed percentage of enrollment requests listed in the input file.
    */
  var JobProgress: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobProgress] = js.undefined
  
  /**
    * The current status of the speaker enrollment job.
    */
  var JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus] = js.undefined
}
object SpeakerEnrollmentJobSummary {
  
  inline def apply(): SpeakerEnrollmentJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerEnrollmentJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeakerEnrollmentJobSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "EndedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "EndedAt", js.undefined)
    
    inline def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobProgress(value: JobProgress): Self = StObject.set(x, "JobProgress", value.asInstanceOf[js.Any])
    
    inline def setJobProgressUndefined: Self = StObject.set(x, "JobProgress", js.undefined)
    
    inline def setJobStatus(value: SpeakerEnrollmentJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
