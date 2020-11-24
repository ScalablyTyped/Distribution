package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccessPointRequest extends js.Object {
  
  /**
    * The ID of the access point that you want to delete.
    */
  var AccessPointId: typings.awsSdk.efsMod.AccessPointId = js.native
}
object DeleteAccessPointRequest {
  
  @scala.inline
  def apply(AccessPointId: AccessPointId): DeleteAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccessPointId = AccessPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPointRequest]
  }
  
  @scala.inline
  implicit class DeleteAccessPointRequestOps[Self <: DeleteAccessPointRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessPointId(value: AccessPointId): Self = this.set("AccessPointId", value.asInstanceOf[js.Any])
  }
}
