package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseHostsRequest extends js.Object {
  
  /**
    * The IDs of the Dedicated Hosts to release.
    */
  var HostIds: RequestHostIdList = js.native
}
object ReleaseHostsRequest {
  
  @scala.inline
  def apply(HostIds: RequestHostIdList): ReleaseHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseHostsRequest]
  }
  
  @scala.inline
  implicit class ReleaseHostsRequestOps[Self <: ReleaseHostsRequest] (val x: Self) extends AnyVal {
    
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
    def setHostIdsVarargs(value: DedicatedHostId*): Self = this.set("HostIds", js.Array(value :_*))
    
    @scala.inline
    def setHostIds(value: RequestHostIdList): Self = this.set("HostIds", value.asInstanceOf[js.Any])
  }
}
