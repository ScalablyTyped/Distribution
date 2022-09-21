package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricSetDataQualityMetric extends StObject {
  
  /**
    * The array of data quality metrics contained in the data quality metric set.
    */
  var DataQualityMetricList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DataQualityMetricList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the data quality metric array.
    */
  var MetricSetArn: js.UndefOr[Arn] = js.undefined
}
object MetricSetDataQualityMetric {
  
  inline def apply(): MetricSetDataQualityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricSetDataQualityMetric]
  }
  
  extension [Self <: MetricSetDataQualityMetric](x: Self) {
    
    inline def setDataQualityMetricList(value: DataQualityMetricList): Self = StObject.set(x, "DataQualityMetricList", value.asInstanceOf[js.Any])
    
    inline def setDataQualityMetricListUndefined: Self = StObject.set(x, "DataQualityMetricList", js.undefined)
    
    inline def setDataQualityMetricListVarargs(value: DataQualityMetric*): Self = StObject.set(x, "DataQualityMetricList", js.Array(value*))
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArnUndefined: Self = StObject.set(x, "MetricSetArn", js.undefined)
  }
}
