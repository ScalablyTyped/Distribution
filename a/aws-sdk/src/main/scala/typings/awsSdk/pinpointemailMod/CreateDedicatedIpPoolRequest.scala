package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDedicatedIpPoolRequest extends js.Object {
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: typings.awsSdk.pinpointemailMod.PoolName = js.native
  /**
    * An object that defines the tags (keys and values) that you want to associate with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDedicatedIpPoolRequest {
  @scala.inline
  def apply(PoolName: PoolName, Tags: TagList = null): CreateDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
  }
}

