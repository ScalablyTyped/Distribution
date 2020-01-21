package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityOptionsStatus extends js.Object {
  /**
    * The availability options configured for the domain.
    */
  var Options: MultiAZ = js.native
  var Status: OptionStatus = js.native
}

object AvailabilityOptionsStatus {
  @scala.inline
  def apply(Options: MultiAZ, Status: OptionStatus): AvailabilityOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvailabilityOptionsStatus]
  }
}

