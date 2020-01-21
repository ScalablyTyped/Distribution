package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCreditSpecificationRequest extends js.Object {
  /**
    * The credit option for CPU usage of the instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object InstanceCreditSpecificationRequest {
  @scala.inline
  def apply(CpuCredits: String = null, InstanceId: String = null): InstanceCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    if (CpuCredits != null) __obj.updateDynamic("CpuCredits")(CpuCredits.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCreditSpecificationRequest]
  }
}

