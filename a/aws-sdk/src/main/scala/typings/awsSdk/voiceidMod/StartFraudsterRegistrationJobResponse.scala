package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFraudsterRegistrationJobResponse extends StObject {
  
  /**
    * Details about the started fraudster registration job.
    */
  var Job: js.UndefOr[FraudsterRegistrationJob] = js.undefined
}
object StartFraudsterRegistrationJobResponse {
  
  inline def apply(): StartFraudsterRegistrationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFraudsterRegistrationJobResponse]
  }
  
  extension [Self <: StartFraudsterRegistrationJobResponse](x: Self) {
    
    inline def setJob(value: FraudsterRegistrationJob): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
