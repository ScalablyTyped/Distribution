package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentSchedule extends StObject {
  
  /**
    * The time and date that Evidently completed the analysis of the experiment.
    */
  var analysisCompleteTime: js.UndefOr[js.Date] = js.undefined
}
object ExperimentSchedule {
  
  inline def apply(): ExperimentSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentSchedule]
  }
  
  extension [Self <: ExperimentSchedule](x: Self) {
    
    inline def setAnalysisCompleteTime(value: js.Date): Self = StObject.set(x, "analysisCompleteTime", value.asInstanceOf[js.Any])
    
    inline def setAnalysisCompleteTimeUndefined: Self = StObject.set(x, "analysisCompleteTime", js.undefined)
  }
}
