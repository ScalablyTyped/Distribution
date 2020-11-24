package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnectionStatus extends js.Object {
  
  /**
    * Code indicating the status of a VPC peering connection.
    */
  var Code: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Additional messaging associated with the connection status. 
    */
  var Message: js.UndefOr[NonZeroAndMaxString] = js.native
}
object VpcPeeringConnectionStatus {
  
  @scala.inline
  def apply(): VpcPeeringConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionStatus]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionStatusOps[Self <: VpcPeeringConnectionStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: NonZeroAndMaxString): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setMessage(value: NonZeroAndMaxString): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
