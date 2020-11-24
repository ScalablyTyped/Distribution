package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateConnectionStatus extends js.Object {
  
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.native
  
  /**
    * A message about the status of the client connection, if applicable.
    */
  var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
  
  /**
    * The state of the client connection.
    */
  var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
}
object TerminateConnectionStatus {
  
  @scala.inline
  def apply(): TerminateConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateConnectionStatus]
  }
  
  @scala.inline
  implicit class TerminateConnectionStatusOps[Self <: TerminateConnectionStatus] (val x: Self) extends AnyVal {
    
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
    def setConnectionId(value: String): Self = this.set("ConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("ConnectionId", js.undefined)
    
    @scala.inline
    def setCurrentStatus(value: ClientVpnConnectionStatus): Self = this.set("CurrentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentStatus: Self = this.set("CurrentStatus", js.undefined)
    
    @scala.inline
    def setPreviousStatus(value: ClientVpnConnectionStatus): Self = this.set("PreviousStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousStatus: Self = this.set("PreviousStatus", js.undefined)
  }
}
