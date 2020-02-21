package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6Pool extends js.Object {
  /**
    * The description for the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The CIDR blocks for the address pool.
    */
  var PoolCidrBlocks: js.UndefOr[PoolCidrBlocksSet] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Ipv6Pool {
  @scala.inline
  def apply(
    Description: String = null,
    PoolCidrBlocks: PoolCidrBlocksSet = null,
    PoolId: String = null,
    Tags: TagList = null
  ): Ipv6Pool = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (PoolCidrBlocks != null) __obj.updateDynamic("PoolCidrBlocks")(PoolCidrBlocks.asInstanceOf[js.Any])
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipv6Pool]
  }
}

