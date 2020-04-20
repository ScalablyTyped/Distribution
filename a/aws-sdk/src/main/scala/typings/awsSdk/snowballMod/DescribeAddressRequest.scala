package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressRequest extends js.Object {
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: typings.awsSdk.snowballMod.AddressId = js.native
}

object DescribeAddressRequest {
  @scala.inline
  def apply(AddressId: AddressId): DescribeAddressRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddressRequest]
  }
}

