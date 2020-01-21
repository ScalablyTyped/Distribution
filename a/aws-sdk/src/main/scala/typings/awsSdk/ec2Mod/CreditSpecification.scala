package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage of a T2 or T3 instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
}

object CreditSpecification {
  @scala.inline
  def apply(CpuCredits: String = null): CreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (CpuCredits != null) __obj.updateDynamic("CpuCredits")(CpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditSpecification]
  }
}

