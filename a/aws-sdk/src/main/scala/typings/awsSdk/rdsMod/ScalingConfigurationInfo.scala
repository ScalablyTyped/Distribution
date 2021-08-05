package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingConfigurationInfo extends StObject {
  
  /**
    * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. When the value is set to false for an Aurora Serverless DB cluster, the DB cluster automatically resumes.
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The maximum capacity for the Aurora DB cluster in serverless DB engine mode.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The remaining amount of time, in seconds, before the Aurora DB cluster in serverless mode is paused. A DB cluster can be paused only when it's idle (it has no connections).
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}
object ScalingConfigurationInfo {
  
  inline def apply(): ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfigurationInfo]
  }
  
  extension [Self <: ScalingConfigurationInfo](x: Self) {
    
    inline def setAutoPause(value: BooleanOptional): Self = StObject.set(x, "AutoPause", value.asInstanceOf[js.Any])
    
    inline def setAutoPauseUndefined: Self = StObject.set(x, "AutoPause", js.undefined)
    
    inline def setMaxCapacity(value: IntegerOptional): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMinCapacity(value: IntegerOptional): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
    
    inline def setSecondsUntilAutoPause(value: IntegerOptional): Self = StObject.set(x, "SecondsUntilAutoPause", value.asInstanceOf[js.Any])
    
    inline def setSecondsUntilAutoPauseUndefined: Self = StObject.set(x, "SecondsUntilAutoPause", js.undefined)
    
    inline def setTimeoutAction(value: String): Self = StObject.set(x, "TimeoutAction", value.asInstanceOf[js.Any])
    
    inline def setTimeoutActionUndefined: Self = StObject.set(x, "TimeoutAction", js.undefined)
  }
}
