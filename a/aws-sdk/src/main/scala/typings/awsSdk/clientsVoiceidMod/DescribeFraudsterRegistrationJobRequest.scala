package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFraudsterRegistrationJobRequest extends StObject {
  
  /**
    * The identifier of the domain that contains the fraudster registration job.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the fraudster registration job you are describing.
    */
  var JobId: typings.awsSdk.clientsVoiceidMod.JobId
}
object DescribeFraudsterRegistrationJobRequest {
  
  inline def apply(DomainId: DomainId, JobId: JobId): DescribeFraudsterRegistrationJobRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFraudsterRegistrationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFraudsterRegistrationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
