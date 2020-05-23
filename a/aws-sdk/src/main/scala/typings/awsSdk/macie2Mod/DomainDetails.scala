package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetails extends js.Object {
  /**
    * Reserved for future use.
    */
  var domainName: js.UndefOr[string] = js.native
}

object DomainDetails {
  @scala.inline
  def apply(domainName: string = null): DomainDetails = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetails]
  }
}

