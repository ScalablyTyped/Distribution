package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFraudsterRegistrationJobResponse extends StObject {
  
  /**
    * Contains details about the specified fraudster registration job.
    */
  var Job: js.UndefOr[FraudsterRegistrationJob] = js.undefined
}
object DescribeFraudsterRegistrationJobResponse {
  
  inline def apply(): DescribeFraudsterRegistrationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFraudsterRegistrationJobResponse]
  }
  
  extension [Self <: DescribeFraudsterRegistrationJobResponse](x: Self) {
    
    inline def setJob(value: FraudsterRegistrationJob): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
