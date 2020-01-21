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
}

