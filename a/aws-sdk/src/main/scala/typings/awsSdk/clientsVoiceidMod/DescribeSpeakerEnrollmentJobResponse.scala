package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpeakerEnrollmentJobResponse extends StObject {
  
  /**
    * Contains details about the specified speaker enrollment job.
    */
  var Job: js.UndefOr[SpeakerEnrollmentJob] = js.undefined
}
object DescribeSpeakerEnrollmentJobResponse {
  
  inline def apply(): DescribeSpeakerEnrollmentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpeakerEnrollmentJobResponse]
  }
  
  extension [Self <: DescribeSpeakerEnrollmentJobResponse](x: Self) {
    
    inline def setJob(value: SpeakerEnrollmentJob): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
