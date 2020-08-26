package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZoneConfig extends js.Object {
  /**
    * Any comments that you want to include about the hosted zone.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  /**
    * A value that indicates whether this is a private hosted zone.
    */
  var PrivateZone: js.UndefOr[IsPrivateZone] = js.native
}

object HostedZoneConfig {
  @scala.inline
  def apply(): HostedZoneConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedZoneConfig]
  }
  @scala.inline
  implicit class HostedZoneConfigOps[Self <: HostedZoneConfig] (val x: Self) extends AnyVal {
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
    def setComment(value: ResourceDescription): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    @scala.inline
    def setPrivateZone(value: IsPrivateZone): Self = this.set("PrivateZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateZone: Self = this.set("PrivateZone", js.undefined)
  }
  
}

