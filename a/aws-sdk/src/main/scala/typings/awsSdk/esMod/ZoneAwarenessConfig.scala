package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAwarenessConfig extends js.Object {
  /**
    * An integer value to indicate the number of availability zones for a domain when zone awareness is enabled. This should be equal to number of subnets if VPC endpoints is enabled
    */
  var AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.native
}

object ZoneAwarenessConfig {
  @scala.inline
  def apply(): ZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneAwarenessConfig]
  }
  @scala.inline
  implicit class ZoneAwarenessConfigOps[Self <: ZoneAwarenessConfig] (val x: Self) extends AnyVal {
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
    def setAvailabilityZoneCount(value: IntegerClass): Self = this.set("AvailabilityZoneCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneCount: Self = this.set("AvailabilityZoneCount", js.undefined)
  }
  
}

