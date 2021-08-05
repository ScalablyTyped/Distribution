package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseResourceMetricKey extends StObject {
  
  /**
    * The valid dimensions for the metric.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.undefined
  
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String
}
object ResponseResourceMetricKey {
  
  inline def apply(Metric: String): ResponseResourceMetricKey = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseResourceMetricKey]
  }
  
  extension [Self <: ResponseResourceMetricKey](x: Self) {
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
  }
}
