package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudsterRegistrationJobSummary extends StObject {
  
  /**
    * A timestamp showing when the fraudster registration job is created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the domain containing the fraudster registration job.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * A timestamp showing when the fraudster registration job ended.
    */
  var EndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains details that are populated when an entire batch job fails. In cases of individual registration job failures, the batch job as a whole doesn't fail; it is completed with a JobStatus of COMPLETED_WITH_ERRORS. You can use the job output file to identify the individual registration requests that failed.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.clientsVoiceidMod.FailureDetails] = js.undefined
  
  /**
    * The service-generated identifier for the fraudster registration job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobId] = js.undefined
  
  /**
    * The client-provided name for the fraudster registration job.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobName] = js.undefined
  
  /**
    * Shows the completed percentage of registration requests listed in the input file.
    */
  var JobProgress: js.UndefOr[typings.awsSdk.clientsVoiceidMod.JobProgress] = js.undefined
  
  /**
    * The current status of the fraudster registration job.
    */
  var JobStatus: js.UndefOr[FraudsterRegistrationJobStatus] = js.undefined
}
object FraudsterRegistrationJobSummary {
  
  inline def apply(): FraudsterRegistrationJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FraudsterRegistrationJobSummary]
  }
  
  extension [Self <: FraudsterRegistrationJobSummary](x: Self) {
    
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
    
    inline def setJobStatus(value: FraudsterRegistrationJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
