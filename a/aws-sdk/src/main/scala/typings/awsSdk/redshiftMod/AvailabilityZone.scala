package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * The name of the availability zone.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * 
    */
  var SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  @scala.inline
  implicit class AvailabilityZoneOps[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSupportedPlatformsVarargs(value: SupportedPlatform*): Self = this.set("SupportedPlatforms", js.Array(value :_*))
    @scala.inline
    def setSupportedPlatforms(value: SupportedPlatformsList): Self = this.set("SupportedPlatforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedPlatforms: Self = this.set("SupportedPlatforms", js.undefined)
  }
  
}

