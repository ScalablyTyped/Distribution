package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsRequestAction extends js.Object {
  /**
    * Domain information for the API request.
    */
  var Domain: js.UndefOr[String] = js.native
}

object DnsRequestAction {
  @scala.inline
  def apply(Domain: String = null): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsRequestAction]
  }
}

