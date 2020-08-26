package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsRequestAction extends js.Object {
  /**
    * The domain information for the API request.
    */
  var Domain: js.UndefOr[String] = js.native
}

object DnsRequestAction {
  @scala.inline
  def apply(): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRequestAction]
  }
  @scala.inline
  implicit class DnsRequestActionOps[Self <: DnsRequestAction] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
  }
  
}

