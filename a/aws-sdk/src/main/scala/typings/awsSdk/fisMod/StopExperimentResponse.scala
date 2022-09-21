package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExperimentResponse extends StObject {
  
  /**
    * Information about the experiment.
    */
  var experiment: js.UndefOr[Experiment] = js.undefined
}
object StopExperimentResponse {
  
  inline def apply(): StopExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopExperimentResponse]
  }
  
  extension [Self <: StopExperimentResponse](x: Self) {
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setExperimentUndefined: Self = StObject.set(x, "experiment", js.undefined)
  }
}
