package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpeakerEnrollmentJobRequest extends StObject {
  
  /**
    * The identifier of the domain that contains the speaker enrollment job.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the speaker enrollment job you are describing.
    */
  var JobId: typings.awsSdk.clientsVoiceidMod.JobId
}
object DescribeSpeakerEnrollmentJobRequest {
  
  inline def apply(DomainId: DomainId, JobId: JobId): DescribeSpeakerEnrollmentJobRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpeakerEnrollmentJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpeakerEnrollmentJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
