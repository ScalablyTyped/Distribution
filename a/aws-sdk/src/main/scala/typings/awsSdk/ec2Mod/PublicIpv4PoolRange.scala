package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicIpv4PoolRange extends js.Object {
  /**
    * The number of addresses in the range.
    */
  var AddressCount: js.UndefOr[Integer] = js.native
  /**
    * The number of available addresses in the range.
    */
  var AvailableAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The first IP address in the range.
    */
  var FirstAddress: js.UndefOr[String] = js.native
  /**
    * The last IP address in the range.
    */
  var LastAddress: js.UndefOr[String] = js.native
}

object PublicIpv4PoolRange {
  @scala.inline
  def apply(): PublicIpv4PoolRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4PoolRange]
  }
  @scala.inline
  implicit class PublicIpv4PoolRangeOps[Self <: PublicIpv4PoolRange] (val x: Self) extends AnyVal {
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
    def setAddressCount(value: Integer): Self = this.set("AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressCount: Self = this.set("AddressCount", js.undefined)
    @scala.inline
    def setAvailableAddressCount(value: Integer): Self = this.set("AvailableAddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableAddressCount: Self = this.set("AvailableAddressCount", js.undefined)
    @scala.inline
    def setFirstAddress(value: String): Self = this.set("FirstAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstAddress: Self = this.set("FirstAddress", js.undefined)
    @scala.inline
    def setLastAddress(value: String): Self = this.set("LastAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAddress: Self = this.set("LastAddress", js.undefined)
  }
  
}

