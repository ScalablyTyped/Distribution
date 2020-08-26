package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressesResult extends js.Object {
  /**
    * Information about the Elastic IP addresses.
    */
  var Addresses: js.UndefOr[AddressList] = js.native
}

object DescribeAddressesResult {
  @scala.inline
  def apply(): DescribeAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesResult]
  }
  @scala.inline
  implicit class DescribeAddressesResultOps[Self <: DescribeAddressesResult] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: Address*): Self = this.set("Addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: AddressList): Self = this.set("Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("Addresses", js.undefined)
  }
  
}

