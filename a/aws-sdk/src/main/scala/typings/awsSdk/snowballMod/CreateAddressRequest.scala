package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressRequest extends js.Object {
  /**
    * The address that you want the Snowball shipped to.
    */
  var Address: typings.awsSdk.snowballMod.Address = js.native
}

object CreateAddressRequest {
  @scala.inline
  def apply(Address: Address): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAddressRequest]
  }
}

