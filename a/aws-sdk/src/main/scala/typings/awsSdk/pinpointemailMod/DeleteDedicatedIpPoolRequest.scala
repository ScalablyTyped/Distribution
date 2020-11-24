package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDedicatedIpPoolRequest extends js.Object {
  
  /**
    * The name of the dedicated IP pool that you want to delete.
    */
  var PoolName: typings.awsSdk.pinpointemailMod.PoolName = js.native
}
object DeleteDedicatedIpPoolRequest {
  
  @scala.inline
  def apply(PoolName: PoolName): DeleteDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
  }
  
  @scala.inline
  implicit class DeleteDedicatedIpPoolRequestOps[Self <: DeleteDedicatedIpPoolRequest] (val x: Self) extends AnyVal {
    
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
    def setPoolName(value: PoolName): Self = this.set("PoolName", value.asInstanceOf[js.Any])
  }
}
