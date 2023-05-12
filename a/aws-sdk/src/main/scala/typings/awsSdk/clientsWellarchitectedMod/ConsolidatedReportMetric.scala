package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolidatedReportMetric extends StObject {
  
  /**
    * The metrics for the lenses in the workload.
    */
  var Lenses: js.UndefOr[LensMetrics] = js.undefined
  
  /**
    * The total number of lenses applied to the workload.
    */
  var LensesAppliedCount: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensesAppliedCount] = js.undefined
  
  /**
    * The metric type of a metric in the consolidated report. Currently only WORKLOAD metric types are supported.
    */
  var MetricType: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MetricType] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.RiskCounts] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  var WorkloadArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadName] = js.undefined
}
object ConsolidatedReportMetric {
  
  inline def apply(): ConsolidatedReportMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolidatedReportMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsolidatedReportMetric] (val x: Self) extends AnyVal {
    
    inline def setLenses(value: LensMetrics): Self = StObject.set(x, "Lenses", value.asInstanceOf[js.Any])
    
    inline def setLensesAppliedCount(value: LensesAppliedCount): Self = StObject.set(x, "LensesAppliedCount", value.asInstanceOf[js.Any])
    
    inline def setLensesAppliedCountUndefined: Self = StObject.set(x, "LensesAppliedCount", js.undefined)
    
    inline def setLensesUndefined: Self = StObject.set(x, "Lenses", js.undefined)
    
    inline def setLensesVarargs(value: LensMetric*): Self = StObject.set(x, "Lenses", js.Array(value*))
    
    inline def setMetricType(value: MetricType): Self = StObject.set(x, "MetricType", value.asInstanceOf[js.Any])
    
    inline def setMetricTypeUndefined: Self = StObject.set(x, "MetricType", js.undefined)
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
    
    inline def setWorkloadArnUndefined: Self = StObject.set(x, "WorkloadArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
