package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSpotInstanceRequestsResult extends js.Object {
  
  /**
    * One or more Spot Instance requests.
    */
  var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.native
}
object CancelSpotInstanceRequestsResult {
  
  @scala.inline
  def apply(): CancelSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotInstanceRequestsResult]
  }
  
  @scala.inline
  implicit class CancelSpotInstanceRequestsResultOps[Self <: CancelSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
    
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
    def setCancelledSpotInstanceRequestsVarargs(value: CancelledSpotInstanceRequest*): Self = this.set("CancelledSpotInstanceRequests", js.Array(value :_*))
    
    @scala.inline
    def setCancelledSpotInstanceRequests(value: CancelledSpotInstanceRequestList): Self = this.set("CancelledSpotInstanceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelledSpotInstanceRequests: Self = this.set("CancelledSpotInstanceRequests", js.undefined)
  }
}
