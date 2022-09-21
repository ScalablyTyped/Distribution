package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsReferenceComparisonValues extends StObject {
  
  /**
    * A metric that DevOps Guru compares to actual metric values. This reference metric is used to determine if an actual metric should be considered anomalous.
    */
  var ReferenceMetric: js.UndefOr[PerformanceInsightsReferenceMetric] = js.undefined
  
  /**
    * A scalar value DevOps Guru for a metric that DevOps Guru compares to actual metric values. This reference value is used to determine if an actual metric value should be considered anomalous.
    */
  var ReferenceScalar: js.UndefOr[PerformanceInsightsReferenceScalar] = js.undefined
}
object PerformanceInsightsReferenceComparisonValues {
  
  inline def apply(): PerformanceInsightsReferenceComparisonValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsReferenceComparisonValues]
  }
  
  extension [Self <: PerformanceInsightsReferenceComparisonValues](x: Self) {
    
    inline def setReferenceMetric(value: PerformanceInsightsReferenceMetric): Self = StObject.set(x, "ReferenceMetric", value.asInstanceOf[js.Any])
    
    inline def setReferenceMetricUndefined: Self = StObject.set(x, "ReferenceMetric", js.undefined)
    
    inline def setReferenceScalar(value: PerformanceInsightsReferenceScalar): Self = StObject.set(x, "ReferenceScalar", value.asInstanceOf[js.Any])
    
    inline def setReferenceScalarUndefined: Self = StObject.set(x, "ReferenceScalar", js.undefined)
  }
}
