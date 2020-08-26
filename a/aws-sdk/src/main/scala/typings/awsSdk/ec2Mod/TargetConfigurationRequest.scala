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
  def apply(OfferingId: ReservedInstancesOfferingId): TargetConfigurationRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfigurationRequest]
  }
  @scala.inline
  implicit class TargetConfigurationRequestOps[Self <: TargetConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOfferingId(value: ReservedInstancesOfferingId): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
  }
  
}

