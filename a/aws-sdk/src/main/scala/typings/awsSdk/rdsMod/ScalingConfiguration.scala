package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingConfiguration extends StObject {
  
  /**
    * A value that indicates whether to allow or disallow automatic pause for an Aurora DB cluster in serverless DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).  If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.  
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode. For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256. For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384. The maximum capacity must be greater than or equal to the minimum capacity.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The minimum capacity for an Aurora DB cluster in serverless DB engine mode. For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256. For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384. The minimum capacity must be less than or equal to the maximum capacity.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The time, in seconds, before an Aurora DB cluster in serverless mode is paused.
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange sets the capacity to the specified value as soon as possible.  RollbackCapacityChange, the default, ignores the capacity change if a scaling point isn't found in the timeout period.  If you specify ForceApplyCapacityChange, connections that prevent Aurora Serverless from finding a scaling point might be dropped.  For more information, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}
object ScalingConfiguration {
  
  @scala.inline
  def apply(): ScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfiguration]
  }
  
  @scala.inline
  implicit class ScalingConfigurationMutableBuilder[Self <: ScalingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPause(value: BooleanOptional): Self = StObject.set(x, "AutoPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPauseUndefined: Self = StObject.set(x, "AutoPause", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: IntegerOptional): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    @scala.inline
    def setMinCapacity(value: IntegerOptional): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
    
    @scala.inline
    def setSecondsUntilAutoPause(value: IntegerOptional): Self = StObject.set(x, "SecondsUntilAutoPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUntilAutoPauseUndefined: Self = StObject.set(x, "SecondsUntilAutoPause", js.undefined)
    
    @scala.inline
    def setTimeoutAction(value: String): Self = StObject.set(x, "TimeoutAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutActionUndefined: Self = StObject.set(x, "TimeoutAction", js.undefined)
  }
}
