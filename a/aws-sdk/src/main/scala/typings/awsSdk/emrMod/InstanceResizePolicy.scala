package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceResizePolicy extends js.Object {
  
  /**
    * Decommissioning timeout override for the specific list of instances to be terminated.
    */
  var InstanceTerminationTimeout: js.UndefOr[Integer] = js.native
  
  /**
    * Specific list of instances to be protected when shrinking an instance group.
    */
  var InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.native
  
  /**
    * Specific list of instances to be terminated when shrinking an instance group.
    */
  var InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.native
}
object InstanceResizePolicy {
  
  @scala.inline
  def apply(): InstanceResizePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceResizePolicy]
  }
  
  @scala.inline
  implicit class InstanceResizePolicyOps[Self <: InstanceResizePolicy] (val x: Self) extends AnyVal {
    
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
    def setInstanceTerminationTimeout(value: Integer): Self = this.set("InstanceTerminationTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTerminationTimeout: Self = this.set("InstanceTerminationTimeout", js.undefined)
    
    @scala.inline
    def setInstancesToProtectVarargs(value: InstanceId*): Self = this.set("InstancesToProtect", js.Array(value :_*))
    
    @scala.inline
    def setInstancesToProtect(value: EC2InstanceIdsList): Self = this.set("InstancesToProtect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancesToProtect: Self = this.set("InstancesToProtect", js.undefined)
    
    @scala.inline
    def setInstancesToTerminateVarargs(value: InstanceId*): Self = this.set("InstancesToTerminate", js.Array(value :_*))
    
    @scala.inline
    def setInstancesToTerminate(value: EC2InstanceIdsList): Self = this.set("InstancesToTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancesToTerminate: Self = this.set("InstancesToTerminate", js.undefined)
  }
}
