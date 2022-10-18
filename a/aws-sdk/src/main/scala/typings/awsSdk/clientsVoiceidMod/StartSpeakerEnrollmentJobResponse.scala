package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSpeakerEnrollmentJobResponse extends StObject {
  
  /**
    * Details about the started speaker enrollment job.
    */
  var Job: js.UndefOr[SpeakerEnrollmentJob] = js.undefined
}
object StartSpeakerEnrollmentJobResponse {
  
  inline def apply(): StartSpeakerEnrollmentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSpeakerEnrollmentJobResponse]
  }
  
  extension [Self <: StartSpeakerEnrollmentJobResponse](x: Self) {
    
    inline def setJob(value: SpeakerEnrollmentJob): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
