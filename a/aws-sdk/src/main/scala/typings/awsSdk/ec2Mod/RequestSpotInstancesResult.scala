package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSpotInstancesResult extends js.Object {
  
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.native
}
object RequestSpotInstancesResult {
  
  @scala.inline
  def apply(): RequestSpotInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotInstancesResult]
  }
  
  @scala.inline
  implicit class RequestSpotInstancesResultOps[Self <: RequestSpotInstancesResult] (val x: Self) extends AnyVal {
    
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
    def setSpotInstanceRequestsVarargs(value: SpotInstanceRequest*): Self = this.set("SpotInstanceRequests", js.Array(value :_*))
    
    @scala.inline
    def setSpotInstanceRequests(value: SpotInstanceRequestList): Self = this.set("SpotInstanceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceRequests: Self = this.set("SpotInstanceRequests", js.undefined)
  }
}
