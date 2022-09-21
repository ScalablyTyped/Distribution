package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingDescription extends StObject {
  
  /**
    * The maximum number of workers allocated to the connector.
    */
  var maxWorkerCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
    */
  var mcuCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The minimum number of workers allocated to the connector.
    */
  var minWorkerCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The sacle-in policy for the connector.
    */
  var scaleInPolicy: js.UndefOr[ScaleInPolicyDescription] = js.undefined
  
  /**
    * The sacle-out policy for the connector.&gt;
    */
  var scaleOutPolicy: js.UndefOr[ScaleOutPolicyDescription] = js.undefined
}
object AutoScalingDescription {
  
  inline def apply(): AutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingDescription]
  }
  
  extension [Self <: AutoScalingDescription](x: Self) {
    
    inline def setMaxWorkerCount(value: integer): Self = StObject.set(x, "maxWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkerCountUndefined: Self = StObject.set(x, "maxWorkerCount", js.undefined)
    
    inline def setMcuCount(value: integer): Self = StObject.set(x, "mcuCount", value.asInstanceOf[js.Any])
    
    inline def setMcuCountUndefined: Self = StObject.set(x, "mcuCount", js.undefined)
    
    inline def setMinWorkerCount(value: integer): Self = StObject.set(x, "minWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setMinWorkerCountUndefined: Self = StObject.set(x, "minWorkerCount", js.undefined)
    
    inline def setScaleInPolicy(value: ScaleInPolicyDescription): Self = StObject.set(x, "scaleInPolicy", value.asInstanceOf[js.Any])
    
    inline def setScaleInPolicyUndefined: Self = StObject.set(x, "scaleInPolicy", js.undefined)
    
    inline def setScaleOutPolicy(value: ScaleOutPolicyDescription): Self = StObject.set(x, "scaleOutPolicy", value.asInstanceOf[js.Any])
    
    inline def setScaleOutPolicyUndefined: Self = StObject.set(x, "scaleOutPolicy", js.undefined)
  }
}
