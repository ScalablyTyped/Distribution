package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityBaselineConfig extends StObject {
  
  /**
    * The name of the job that performs baselining for the data quality monitoring job.
    */
  var BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined
  
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
  
  var StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.undefined
}
object DataQualityBaselineConfig {
  
  inline def apply(): DataQualityBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityBaselineConfig]
  }
  
  extension [Self <: DataQualityBaselineConfig](x: Self) {
    
    inline def setBaseliningJobName(value: ProcessingJobName): Self = StObject.set(x, "BaseliningJobName", value.asInstanceOf[js.Any])
    
    inline def setBaseliningJobNameUndefined: Self = StObject.set(x, "BaseliningJobName", js.undefined)
    
    inline def setConstraintsResource(value: MonitoringConstraintsResource): Self = StObject.set(x, "ConstraintsResource", value.asInstanceOf[js.Any])
    
    inline def setConstraintsResourceUndefined: Self = StObject.set(x, "ConstraintsResource", js.undefined)
    
    inline def setStatisticsResource(value: MonitoringStatisticsResource): Self = StObject.set(x, "StatisticsResource", value.asInstanceOf[js.Any])
    
    inline def setStatisticsResourceUndefined: Self = StObject.set(x, "StatisticsResource", js.undefined)
  }
}
