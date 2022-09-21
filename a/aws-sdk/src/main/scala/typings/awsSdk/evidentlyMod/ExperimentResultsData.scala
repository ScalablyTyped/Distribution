package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentResultsData extends StObject {
  
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[CwDimensionSafeName] = js.undefined
  
  /**
    * The experiment statistic that these results pertain to.
    */
  var resultStat: js.UndefOr[ExperimentResultResponseType] = js.undefined
  
  /**
    * The treatment, or variation, that returned the values in this structure.
    */
  var treatmentName: js.UndefOr[TreatmentName] = js.undefined
  
  /**
    * The values for the metricName that were recorded in the experiment.
    */
  var values: js.UndefOr[DoubleValueList] = js.undefined
}
object ExperimentResultsData {
  
  inline def apply(): ExperimentResultsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentResultsData]
  }
  
  extension [Self <: ExperimentResultsData](x: Self) {
    
    inline def setMetricName(value: CwDimensionSafeName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setResultStat(value: ExperimentResultResponseType): Self = StObject.set(x, "resultStat", value.asInstanceOf[js.Any])
    
    inline def setResultStatUndefined: Self = StObject.set(x, "resultStat", js.undefined)
    
    inline def setTreatmentName(value: TreatmentName): Self = StObject.set(x, "treatmentName", value.asInstanceOf[js.Any])
    
    inline def setTreatmentNameUndefined: Self = StObject.set(x, "treatmentName", js.undefined)
    
    inline def setValues(value: DoubleValueList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
