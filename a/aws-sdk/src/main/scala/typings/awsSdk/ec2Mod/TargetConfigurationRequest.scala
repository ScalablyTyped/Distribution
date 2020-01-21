package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetConfigurationRequest extends js.Object {
  /**
    * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The Convertible Reserved Instance offering ID.
    */
  var OfferingId: String = js.native
}

object TargetConfigurationRequest {
  @scala.inline
  def apply(OfferingId: String, InstanceCount: Int | scala.Double = null): TargetConfigurationRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfigurationRequest]
  }
}

