package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressResult extends js.Object {
  /**
    * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
    */
  var Address: js.UndefOr[typings.awsSdk.snowballMod.Address] = js.native
}

object DescribeAddressResult {
  @scala.inline
  def apply(Address: Address = null): DescribeAddressResult = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddressResult]
  }
}

