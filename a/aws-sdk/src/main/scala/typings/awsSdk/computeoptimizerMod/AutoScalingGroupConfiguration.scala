package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroupConfiguration extends js.Object {
  
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
  implicit class AutoScalingGroupConfigurationOps[Self <: AutoScalingGroupConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDesiredCapacity(value: DesiredCapacity): Self = this.set("desiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredCapacity: Self = this.set("desiredCapacity", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setMaxSize(value: MaxSize): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: MinSize): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
}
