package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeAction extends js.Object {
  /**
    * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  /**
    * A list of objects related to port probe details.
    */
  var PortProbeDetails: js.UndefOr[typings.awsSdk.guarddutyMod.PortProbeDetails] = js.native
}

object PortProbeAction {
  @scala.inline
  def apply(): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeAction]
  }
  @scala.inline
  implicit class PortProbeActionOps[Self <: PortProbeAction] (val x: Self) extends AnyVal {
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
    def setBlocked(value: Boolean): Self = this.set("Blocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocked: Self = this.set("Blocked", js.undefined)
    @scala.inline
    def setPortProbeDetailsVarargs(value: PortProbeDetail*): Self = this.set("PortProbeDetails", js.Array(value :_*))
    @scala.inline
    def setPortProbeDetails(value: PortProbeDetails): Self = this.set("PortProbeDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortProbeDetails: Self = this.set("PortProbeDetails", js.undefined)
  }
  
}

