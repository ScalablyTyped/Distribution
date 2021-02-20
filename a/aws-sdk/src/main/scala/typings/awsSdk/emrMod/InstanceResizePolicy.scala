package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceResizePolicy extends StObject {
  
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
  implicit class InstanceResizePolicyMutableBuilder[Self <: InstanceResizePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTerminationTimeout(value: Integer): Self = StObject.set(x, "InstanceTerminationTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTerminationTimeoutUndefined: Self = StObject.set(x, "InstanceTerminationTimeout", js.undefined)
    
    @scala.inline
    def setInstancesToProtect(value: EC2InstanceIdsList): Self = StObject.set(x, "InstancesToProtect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesToProtectUndefined: Self = StObject.set(x, "InstancesToProtect", js.undefined)
    
    @scala.inline
    def setInstancesToProtectVarargs(value: InstanceId*): Self = StObject.set(x, "InstancesToProtect", js.Array(value :_*))
    
    @scala.inline
    def setInstancesToTerminate(value: EC2InstanceIdsList): Self = StObject.set(x, "InstancesToTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesToTerminateUndefined: Self = StObject.set(x, "InstancesToTerminate", js.undefined)
    
    @scala.inline
    def setInstancesToTerminateVarargs(value: InstanceId*): Self = StObject.set(x, "InstancesToTerminate", js.Array(value :_*))
  }
}
