package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingActor extends js.Object {
  /**
    * The DNS name of the entity that performed the action on the affected resource.
    */
  var domainDetails: js.UndefOr[DomainDetails] = js.native
  /**
    * The IP address of the device that the entity used to perform the action on the affected resource. This object also provides information such as the owner and geographical location for the IP address.
    */
  var ipAddressDetails: js.UndefOr[IpAddressDetails] = js.native
  /**
    * The name and type of entity that performed the action on the affected resource.
    */
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}

object FindingActor {
  @scala.inline
  def apply(
    domainDetails: DomainDetails = null,
    ipAddressDetails: IpAddressDetails = null,
    userIdentity: UserIdentity = null
  ): FindingActor = {
    val __obj = js.Dynamic.literal()
    if (domainDetails != null) __obj.updateDynamic("domainDetails")(domainDetails.asInstanceOf[js.Any])
    if (ipAddressDetails != null) __obj.updateDynamic("ipAddressDetails")(ipAddressDetails.asInstanceOf[js.Any])
    if (userIdentity != null) __obj.updateDynamic("userIdentity")(userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingActor]
  }
}

