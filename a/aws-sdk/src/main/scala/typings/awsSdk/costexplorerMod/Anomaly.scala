package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anomaly extends StObject {
  
  /**
    * The last day the anomaly is detected. 
    */
  var AnomalyEndDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    * The unique identifier for the anomaly. 
    */
  var AnomalyId: GenericString
  
  /**
    * The latest and maximum score for the anomaly. 
    */
  var AnomalyScore: typings.awsSdk.costexplorerMod.AnomalyScore
  
  /**
    * The first day the anomaly is detected. 
    */
  var AnomalyStartDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    * The dimension for the anomaly (for example, an Amazon Web Service in a service monitor). 
    */
  var DimensionValue: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The feedback value. 
    */
  var Feedback: js.UndefOr[AnomalyFeedbackType] = js.undefined
  
  /**
    * The dollar impact for the anomaly. 
    */
  var Impact: typings.awsSdk.costexplorerMod.Impact
  
  /**
    * The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly. 
    */
  var MonitorArn: GenericString
  
  /**
    * The list of identified root causes for the anomaly. 
    */
  var RootCauses: js.UndefOr[typings.awsSdk.costexplorerMod.RootCauses] = js.undefined
}
object Anomaly {
  
  inline def apply(AnomalyId: GenericString, AnomalyScore: AnomalyScore, Impact: Impact, MonitorArn: GenericString): Anomaly = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any], AnomalyScore = AnomalyScore.asInstanceOf[js.Any], Impact = Impact.asInstanceOf[js.Any], MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anomaly]
  }
  
  extension [Self <: Anomaly](x: Self) {
    
    inline def setAnomalyEndDate(value: YearMonthDay): Self = StObject.set(x, "AnomalyEndDate", value.asInstanceOf[js.Any])
    
    inline def setAnomalyEndDateUndefined: Self = StObject.set(x, "AnomalyEndDate", js.undefined)
    
    inline def setAnomalyId(value: GenericString): Self = StObject.set(x, "AnomalyId", value.asInstanceOf[js.Any])
    
    inline def setAnomalyScore(value: AnomalyScore): Self = StObject.set(x, "AnomalyScore", value.asInstanceOf[js.Any])
    
    inline def setAnomalyStartDate(value: YearMonthDay): Self = StObject.set(x, "AnomalyStartDate", value.asInstanceOf[js.Any])
    
    inline def setAnomalyStartDateUndefined: Self = StObject.set(x, "AnomalyStartDate", js.undefined)
    
    inline def setDimensionValue(value: GenericString): Self = StObject.set(x, "DimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "DimensionValue", js.undefined)
    
    inline def setFeedback(value: AnomalyFeedbackType): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "Feedback", js.undefined)
    
    inline def setImpact(value: Impact): Self = StObject.set(x, "Impact", value.asInstanceOf[js.Any])
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setRootCauses(value: RootCauses): Self = StObject.set(x, "RootCauses", value.asInstanceOf[js.Any])
    
    inline def setRootCausesUndefined: Self = StObject.set(x, "RootCauses", js.undefined)
    
    inline def setRootCausesVarargs(value: RootCause*): Self = StObject.set(x, "RootCauses", js.Array(value*))
  }
}
