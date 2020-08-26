package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveIpRoutesRequest extends js.Object {
  /**
    * IP address blocks that you want to remove.
    */
  var CidrIps: typings.awsSdk.directoryserviceMod.CidrIps = js.native
  /**
    * Identifier (ID) of the directory from which you want to remove the IP addresses.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object RemoveIpRoutesRequest {
  @scala.inline
  def apply(CidrIps: CidrIps, DirectoryId: DirectoryId): RemoveIpRoutesRequest = {
    val __obj = js.Dynamic.literal(CidrIps = CidrIps.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveIpRoutesRequest]
  }
  @scala.inline
  implicit class RemoveIpRoutesRequestOps[Self <: RemoveIpRoutesRequest] (val x: Self) extends AnyVal {
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
    def setCidrIpsVarargs(value: CidrIp*): Self = this.set("CidrIps", js.Array(value :_*))
    @scala.inline
    def setCidrIps(value: CidrIps): Self = this.set("CidrIps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
  }
  
}

