package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDedicatedIpInPoolRequest extends js.Object {
  /**
    * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that already exists.
    */
  var DestinationPoolName: PoolName = js.native
  /**
    * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP address that's associated with your AWS account.
    */
  var Ip: typings.awsSdk.sesv2Mod.Ip = js.native
}

object PutDedicatedIpInPoolRequest {
  @scala.inline
  def apply(DestinationPoolName: PoolName, Ip: Ip): PutDedicatedIpInPoolRequest = {
    val __obj = js.Dynamic.literal(DestinationPoolName = DestinationPoolName.asInstanceOf[js.Any], Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpInPoolRequest]
  }
}

