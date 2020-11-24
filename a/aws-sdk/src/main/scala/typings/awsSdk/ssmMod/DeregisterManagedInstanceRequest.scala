package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterManagedInstanceRequest extends js.Object {
  
  /**
    * The ID assigned to the managed instance when you registered it using the activation process. 
    */
  var InstanceId: ManagedInstanceId = js.native
}
object DeregisterManagedInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: ManagedInstanceId): DeregisterManagedInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterManagedInstanceRequest]
  }
  
  @scala.inline
  implicit class DeregisterManagedInstanceRequestOps[Self <: DeregisterManagedInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: ManagedInstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
  }
}
