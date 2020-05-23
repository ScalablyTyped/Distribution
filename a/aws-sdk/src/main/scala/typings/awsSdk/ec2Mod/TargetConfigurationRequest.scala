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
  var OfferingId: ReservedInstancesOfferingId = js.native
}

object TargetConfigurationRequest {
  @scala.inline
  def apply(OfferingId: ReservedInstancesOfferingId, InstanceCount: js.UndefOr[Integer] = js.undefined): TargetConfigurationRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfigurationRequest]
  }
}

