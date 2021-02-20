package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceMetrics extends StObject {
  
  var Properties: js.UndefOr[PerformanceMetricsProperties] = js.native
}
object PerformanceMetrics {
  
  @scala.inline
  def apply(): PerformanceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetrics]
  }
  
  @scala.inline
  implicit class PerformanceMetricsMutableBuilder[Self <: PerformanceMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: PerformanceMetricsProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
