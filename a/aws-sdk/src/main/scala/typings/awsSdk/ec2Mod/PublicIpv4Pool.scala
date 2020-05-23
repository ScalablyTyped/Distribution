package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicIpv4Pool extends js.Object {
  /**
    * A description of the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the location from which the address pool is advertised. A network border group is a unique set of Availability Zones or Local Zones from where AWS advertises public IP addresses.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The address ranges.
    */
  var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The total number of addresses.
    */
  var TotalAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The total number of available addresses.
    */
  var TotalAvailableAddressCount: js.UndefOr[Integer] = js.native
}

object PublicIpv4Pool {
  @scala.inline
  def apply(
    Description: String = null,
    NetworkBorderGroup: String = null,
    PoolAddressRanges: PublicIpv4PoolRangeSet = null,
    PoolId: String = null,
    Tags: TagList = null,
    TotalAddressCount: js.UndefOr[Integer] = js.undefined,
    TotalAvailableAddressCount: js.UndefOr[Integer] = js.undefined
  ): PublicIpv4Pool = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    if (PoolAddressRanges != null) __obj.updateDynamic("PoolAddressRanges")(PoolAddressRanges.asInstanceOf[js.Any])
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalAddressCount)) __obj.updateDynamic("TotalAddressCount")(TotalAddressCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalAvailableAddressCount)) __obj.updateDynamic("TotalAvailableAddressCount")(TotalAvailableAddressCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicIpv4Pool]
  }
}

