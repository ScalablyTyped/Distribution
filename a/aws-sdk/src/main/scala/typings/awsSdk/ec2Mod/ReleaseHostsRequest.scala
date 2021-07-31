package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseHostsRequest extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts to release.
    */
  var HostIds: RequestHostIdList
}
object ReleaseHostsRequest {
  
  @scala.inline
  def apply(HostIds: RequestHostIdList): ReleaseHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseHostsRequest]
  }
  
  @scala.inline
  implicit class ReleaseHostsRequestMutableBuilder[Self <: ReleaseHostsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostIds(value: RequestHostIdList): Self = StObject.set(x, "HostIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdsVarargs(value: DedicatedHostId*): Self = StObject.set(x, "HostIds", js.Array(value :_*))
  }
}
