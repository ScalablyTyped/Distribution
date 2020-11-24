package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePortalResponse extends js.Object {
  
  /**
    * The status of the portal, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus = js.native
}
object UpdatePortalResponse {
  
  @scala.inline
  def apply(portalStatus: PortalStatus): UpdatePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalResponse]
  }
  
  @scala.inline
  implicit class UpdatePortalResponseOps[Self <: UpdatePortalResponse] (val x: Self) extends AnyVal {
    
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
    def setPortalStatus(value: PortalStatus): Self = this.set("portalStatus", value.asInstanceOf[js.Any])
  }
}
