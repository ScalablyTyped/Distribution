package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerlessV2ScalingConfigurationInfo extends StObject {
  
  /**
    * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value that you can use is 128.
    */
  var MaxCapacity: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that you can use is 0.5.
    */
  var MinCapacity: js.UndefOr[DoubleOptional] = js.undefined
}
object ServerlessV2ScalingConfigurationInfo {
  
  inline def apply(): ServerlessV2ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerlessV2ScalingConfigurationInfo]
  }
  
  extension [Self <: ServerlessV2ScalingConfigurationInfo](x: Self) {
    
    inline def setMaxCapacity(value: DoubleOptional): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMinCapacity(value: DoubleOptional): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
  }
}
