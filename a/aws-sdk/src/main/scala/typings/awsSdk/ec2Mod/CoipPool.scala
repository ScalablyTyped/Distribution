package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoipPool extends js.Object {
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
  /**
    * The address ranges of the address pool.
    */
  var PoolCidrs: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CoipPool {
  @scala.inline
  def apply(
    LocalGatewayRouteTableId: String = null,
    PoolCidrs: ValueStringList = null,
    PoolId: String = null,
    Tags: TagList = null
  ): CoipPool = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTableId != null) __obj.updateDynamic("LocalGatewayRouteTableId")(LocalGatewayRouteTableId.asInstanceOf[js.Any])
    if (PoolCidrs != null) __obj.updateDynamic("PoolCidrs")(PoolCidrs.asInstanceOf[js.Any])
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoipPool]
  }
}

