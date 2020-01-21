package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetConfiguration extends js.Object {
  /**
    * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Convertible Reserved Instance offering.
    */
  var OfferingId: js.UndefOr[String] = js.native
}

object TargetConfiguration {
  @scala.inline
  def apply(InstanceCount: Int | scala.Double = null, OfferingId: String = null): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfiguration]
  }
}

