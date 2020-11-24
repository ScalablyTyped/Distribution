package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectionStatusResponse extends js.Object {
  
  /**
    * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
    */
  var Status: js.UndefOr[ConnectionStatus] = js.native
  
  /**
    * The ID of the instance to check connection status. 
    */
  var Target: js.UndefOr[SessionTarget] = js.native
}
object GetConnectionStatusResponse {
  
  @scala.inline
  def apply(): GetConnectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionStatusResponse]
  }
  
  @scala.inline
  implicit class GetConnectionStatusResponseOps[Self <: GetConnectionStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ConnectionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTarget(value: SessionTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
  }
}
