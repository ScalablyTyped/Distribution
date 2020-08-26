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
  def apply(): PublicIpv4Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4Pool]
  }
  @scala.inline
  implicit class PublicIpv4PoolOps[Self <: PublicIpv4Pool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = this.set("NetworkBorderGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("NetworkBorderGroup", js.undefined)
    @scala.inline
    def setPoolAddressRangesVarargs(value: PublicIpv4PoolRange*): Self = this.set("PoolAddressRanges", js.Array(value :_*))
    @scala.inline
    def setPoolAddressRanges(value: PublicIpv4PoolRangeSet): Self = this.set("PoolAddressRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolAddressRanges: Self = this.set("PoolAddressRanges", js.undefined)
    @scala.inline
    def setPoolId(value: String): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolId: Self = this.set("PoolId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTotalAddressCount(value: Integer): Self = this.set("TotalAddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalAddressCount: Self = this.set("TotalAddressCount", js.undefined)
    @scala.inline
    def setTotalAvailableAddressCount(value: Integer): Self = this.set("TotalAvailableAddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalAvailableAddressCount: Self = this.set("TotalAvailableAddressCount", js.undefined)
  }
  
}

