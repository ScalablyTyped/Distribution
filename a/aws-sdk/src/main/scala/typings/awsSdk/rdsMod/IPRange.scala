package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPRange extends js.Object {
  /**
    * Specifies the IP range.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.native
}

object IPRange {
  @scala.inline
  def apply(): IPRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPRange]
  }
  @scala.inline
  implicit class IPRangeOps[Self <: IPRange] (val x: Self) extends AnyVal {
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
    def setCIDRIP(value: String): Self = this.set("CIDRIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCIDRIP: Self = this.set("CIDRIP", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

