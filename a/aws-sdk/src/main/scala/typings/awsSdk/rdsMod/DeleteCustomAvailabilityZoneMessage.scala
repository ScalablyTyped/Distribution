package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomAvailabilityZoneMessage extends js.Object {
  /**
    * The custom AZ identifier.
    */
  var CustomAvailabilityZoneId: String = js.native
}

object DeleteCustomAvailabilityZoneMessage {
  @scala.inline
  def apply(CustomAvailabilityZoneId: String): DeleteCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneId = CustomAvailabilityZoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneMessage]
  }
}

