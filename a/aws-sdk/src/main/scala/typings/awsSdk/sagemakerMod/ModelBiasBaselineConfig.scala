package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBiasBaselineConfig extends StObject {
  
  /**
    * The name of the baseline model bias job.
    */
  var BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined
  
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
}
object ModelBiasBaselineConfig {
  
  inline def apply(): ModelBiasBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelBiasBaselineConfig]
  }
  
  extension [Self <: ModelBiasBaselineConfig](x: Self) {
    
    inline def setBaseliningJobName(value: ProcessingJobName): Self = StObject.set(x, "BaseliningJobName", value.asInstanceOf[js.Any])
    
    inline def setBaseliningJobNameUndefined: Self = StObject.set(x, "BaseliningJobName", js.undefined)
    
    inline def setConstraintsResource(value: MonitoringConstraintsResource): Self = StObject.set(x, "ConstraintsResource", value.asInstanceOf[js.Any])
    
    inline def setConstraintsResourceUndefined: Self = StObject.set(x, "ConstraintsResource", js.undefined)
  }
}
