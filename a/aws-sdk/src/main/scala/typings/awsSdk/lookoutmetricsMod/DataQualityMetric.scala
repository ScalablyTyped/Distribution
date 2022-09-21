package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityMetric extends StObject {
  
  /**
    * A description of the data quality metric.
    */
  var MetricDescription: js.UndefOr[DataQualityMetricDescription] = js.undefined
  
  /**
    * The name of the data quality metric.
    */
  var MetricType: js.UndefOr[DataQualityMetricType] = js.undefined
  
  /**
    * The value of the data quality metric.
    */
  var MetricValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The column that is being monitored.
    */
  var RelatedColumnName: js.UndefOr[typings.awsSdk.lookoutmetricsMod.RelatedColumnName] = js.undefined
}
object DataQualityMetric {
  
  inline def apply(): DataQualityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityMetric]
  }
  
  extension [Self <: DataQualityMetric](x: Self) {
    
    inline def setMetricDescription(value: DataQualityMetricDescription): Self = StObject.set(x, "MetricDescription", value.asInstanceOf[js.Any])
    
    inline def setMetricDescriptionUndefined: Self = StObject.set(x, "MetricDescription", js.undefined)
    
    inline def setMetricType(value: DataQualityMetricType): Self = StObject.set(x, "MetricType", value.asInstanceOf[js.Any])
    
    inline def setMetricTypeUndefined: Self = StObject.set(x, "MetricType", js.undefined)
    
    inline def setMetricValue(value: Double): Self = StObject.set(x, "MetricValue", value.asInstanceOf[js.Any])
    
    inline def setMetricValueUndefined: Self = StObject.set(x, "MetricValue", js.undefined)
    
    inline def setRelatedColumnName(value: RelatedColumnName): Self = StObject.set(x, "RelatedColumnName", value.asInstanceOf[js.Any])
    
    inline def setRelatedColumnNameUndefined: Self = StObject.set(x, "RelatedColumnName", js.undefined)
  }
}
