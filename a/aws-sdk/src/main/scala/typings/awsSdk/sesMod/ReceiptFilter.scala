package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptFilter extends js.Object {
  /**
    * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from them.
    */
  var IpFilter: ReceiptIpFilter = js.native
  /**
    * The name of the IP address filter. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: ReceiptFilterName = js.native
}

object ReceiptFilter {
  @scala.inline
  def apply(IpFilter: ReceiptIpFilter, Name: ReceiptFilterName): ReceiptFilter = {
    val __obj = js.Dynamic.literal(IpFilter = IpFilter.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilter]
  }
  @scala.inline
  implicit class ReceiptFilterOps[Self <: ReceiptFilter] (val x: Self) extends AnyVal {
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
    def setIpFilter(value: ReceiptIpFilter): Self = this.set("IpFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ReceiptFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

