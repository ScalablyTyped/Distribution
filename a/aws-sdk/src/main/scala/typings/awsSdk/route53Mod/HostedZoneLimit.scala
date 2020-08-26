package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZoneLimit extends js.Object {
  /**
    * The limit that you requested. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
    */
  var Type: HostedZoneLimitType = js.native
  /**
    * The current value for the limit that is specified by Type.
    */
  var Value: LimitValue = js.native
}

object HostedZoneLimit {
  @scala.inline
  def apply(Type: HostedZoneLimitType, Value: LimitValue): HostedZoneLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneLimit]
  }
  @scala.inline
  implicit class HostedZoneLimitOps[Self <: HostedZoneLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: HostedZoneLimitType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: LimitValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

