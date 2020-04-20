package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDedicatedIpPoolRequest extends js.Object {
  /**
    * The name of the dedicated IP pool that you want to delete.
    */
  var PoolName: typings.awsSdk.pinpointemailMod.PoolName = js.native
}

object DeleteDedicatedIpPoolRequest {
  @scala.inline
  def apply(PoolName: PoolName): DeleteDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
  }
}

