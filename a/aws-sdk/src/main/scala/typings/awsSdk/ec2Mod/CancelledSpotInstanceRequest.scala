package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelledSpotInstanceRequest extends js.Object {
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  
  /**
    * The state of the Spot Instance request.
    */
  var State: js.UndefOr[CancelSpotInstanceRequestState] = js.native
}
object CancelledSpotInstanceRequest {
  
  @scala.inline
  def apply(): CancelledSpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelledSpotInstanceRequest]
  }
  
  @scala.inline
  implicit class CancelledSpotInstanceRequestOps[Self <: CancelledSpotInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setSpotInstanceRequestId(value: String): Self = this.set("SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceRequestId: Self = this.set("SpotInstanceRequestId", js.undefined)
    
    @scala.inline
    def setState(value: CancelSpotInstanceRequestState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
