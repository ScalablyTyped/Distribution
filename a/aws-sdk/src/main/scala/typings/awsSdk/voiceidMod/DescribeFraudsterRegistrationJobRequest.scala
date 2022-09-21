package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFraudsterRegistrationJobRequest extends StObject {
  
  /**
    * The identifier for the domain containing the fraudster registration job.
    */
  var DomainId: typings.awsSdk.voiceidMod.DomainId
  
  /**
    * The identifier for the fraudster registration job you are describing.
    */
  var JobId: typings.awsSdk.voiceidMod.JobId
}
object DescribeFraudsterRegistrationJobRequest {
  
  inline def apply(DomainId: DomainId, JobId: JobId): DescribeFraudsterRegistrationJobRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFraudsterRegistrationJobRequest]
  }
  
  extension [Self <: DescribeFraudsterRegistrationJobRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
