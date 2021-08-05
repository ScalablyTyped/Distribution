package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMetrics extends StObject {
  
  var Properties: js.UndefOr[PerformanceMetricsProperties] = js.undefined
}
object PerformanceMetrics {
  
  inline def apply(): PerformanceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetrics]
  }
  
  extension [Self <: PerformanceMetrics](x: Self) {
    
    inline def setProperties(value: PerformanceMetricsProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
