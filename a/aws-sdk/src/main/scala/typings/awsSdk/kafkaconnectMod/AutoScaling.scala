package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScaling extends StObject {
  
  /**
    * The maximum number of workers allocated to the connector.
    */
  var maxWorkerCount: integerMin1Max10
  
  /**
    * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
    */
  var mcuCount: integerMin1Max8
  
  /**
    * The minimum number of workers allocated to the connector.
    */
  var minWorkerCount: integerMin1Max10
  
  /**
    * The sacle-in policy for the connector.
    */
  var scaleInPolicy: js.UndefOr[ScaleInPolicy] = js.undefined
  
  /**
    * The sacle-out policy for the connector.
    */
  var scaleOutPolicy: js.UndefOr[ScaleOutPolicy] = js.undefined
}
object AutoScaling {
  
  inline def apply(maxWorkerCount: integerMin1Max10, mcuCount: integerMin1Max8, minWorkerCount: integerMin1Max10): AutoScaling = {
    val __obj = js.Dynamic.literal(maxWorkerCount = maxWorkerCount.asInstanceOf[js.Any], mcuCount = mcuCount.asInstanceOf[js.Any], minWorkerCount = minWorkerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScaling]
  }
  
  extension [Self <: AutoScaling](x: Self) {
    
    inline def setMaxWorkerCount(value: integerMin1Max10): Self = StObject.set(x, "maxWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setMcuCount(value: integerMin1Max8): Self = StObject.set(x, "mcuCount", value.asInstanceOf[js.Any])
    
    inline def setMinWorkerCount(value: integerMin1Max10): Self = StObject.set(x, "minWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setScaleInPolicy(value: ScaleInPolicy): Self = StObject.set(x, "scaleInPolicy", value.asInstanceOf[js.Any])
    
    inline def setScaleInPolicyUndefined: Self = StObject.set(x, "scaleInPolicy", js.undefined)
    
    inline def setScaleOutPolicy(value: ScaleOutPolicy): Self = StObject.set(x, "scaleOutPolicy", value.asInstanceOf[js.Any])
    
    inline def setScaleOutPolicyUndefined: Self = StObject.set(x, "scaleOutPolicy", js.undefined)
  }
}
