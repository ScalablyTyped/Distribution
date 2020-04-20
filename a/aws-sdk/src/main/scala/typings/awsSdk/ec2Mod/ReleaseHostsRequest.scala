package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

