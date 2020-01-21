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
}

