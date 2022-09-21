package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExperimentResponse extends StObject {
  
  /**
    * A timestamp that indicates when the experiment started.
    */
  var startedTime: js.UndefOr[js.Date] = js.undefined
}
object StartExperimentResponse {
  
  inline def apply(): StartExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExperimentResponse]
  }
  
  extension [Self <: StartExperimentResponse](x: Self) {
    
    inline def setStartedTime(value: js.Date): Self = StObject.set(x, "startedTime", value.asInstanceOf[js.Any])
    
    inline def setStartedTimeUndefined: Self = StObject.set(x, "startedTime", js.undefined)
  }
}
