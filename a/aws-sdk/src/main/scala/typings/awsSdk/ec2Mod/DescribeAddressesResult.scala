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
  def apply(Addresses: AddressList = null): DescribeAddressesResult = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddressesResult]
  }
}

