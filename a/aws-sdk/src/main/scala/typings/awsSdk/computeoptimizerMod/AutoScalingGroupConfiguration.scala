package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroupConfiguration extends StObject {
  
  /**
    * The desired capacity, or number of instances, for the Auto Scaling group.
    */
  var desiredCapacity: js.UndefOr[DesiredCapacity] = js.native
  
  /**
    * The instance type for the Auto Scaling group.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  
  /**
    * The maximum size, or maximum number of instances, for the Auto Scaling group.
    */
  var maxSize: js.UndefOr[MaxSize] = js.native
  
  /**
    * The minimum size, or minimum number of instances, for the Auto Scaling group.
    */
  var minSize: js.UndefOr[MinSize] = js.native
}
object AutoScalingGroupConfiguration {
  
  @scala.inline
  def apply(): AutoScalingGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupConfiguration]
  }
  
  @scala.inline
  implicit class AutoScalingGroupConfigurationMutableBuilder[Self <: AutoScalingGroupConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredCapacity(value: DesiredCapacity): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setMaxSize(value: MaxSize): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: MinSize): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
