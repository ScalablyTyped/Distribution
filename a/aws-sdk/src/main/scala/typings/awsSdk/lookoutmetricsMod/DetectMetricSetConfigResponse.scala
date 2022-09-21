package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMetricSetConfigResponse extends StObject {
  
  /**
    * The inferred dataset configuration for the datasource.
    */
  var DetectedMetricSetConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DetectedMetricSetConfig] = js.undefined
}
object DetectMetricSetConfigResponse {
  
  inline def apply(): DetectMetricSetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectMetricSetConfigResponse]
  }
  
  extension [Self <: DetectMetricSetConfigResponse](x: Self) {
    
    inline def setDetectedMetricSetConfig(value: DetectedMetricSetConfig): Self = StObject.set(x, "DetectedMetricSetConfig", value.asInstanceOf[js.Any])
    
    inline def setDetectedMetricSetConfigUndefined: Self = StObject.set(x, "DetectedMetricSetConfig", js.undefined)
  }
}
