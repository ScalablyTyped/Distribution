package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableCapacity extends js.Object {
  
  /**
    * The number of instances that can be launched onto the Dedicated Host depending on the host's available capacity. For Dedicated Hosts that support multiple instance types, this parameter represents the number of instances for each instance size that is supported on the host.
    */
  var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.native
  
  /**
    * The number of vCPUs available for launching instances onto the Dedicated Host.
    */
  var AvailableVCpus: js.UndefOr[Integer] = js.native
}
object AvailableCapacity {
  
  @scala.inline
  def apply(): AvailableCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableCapacity]
  }
  
  @scala.inline
  implicit class AvailableCapacityOps[Self <: AvailableCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableInstanceCapacityVarargs(value: InstanceCapacity*): Self = this.set("AvailableInstanceCapacity", js.Array(value :_*))
    
    @scala.inline
    def setAvailableInstanceCapacity(value: AvailableInstanceCapacityList): Self = this.set("AvailableInstanceCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableInstanceCapacity: Self = this.set("AvailableInstanceCapacity", js.undefined)
    
    @scala.inline
    def setAvailableVCpus(value: Integer): Self = this.set("AvailableVCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableVCpus: Self = this.set("AvailableVCpus", js.undefined)
  }
}
