package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingActor extends js.Object {
  /**
    * The domain name of the device that the entity used to perform the action on the affected resource.
    */
  var domainDetails: js.UndefOr[DomainDetails] = js.native
  /**
    * The IP address of the device that the entity used to perform the action on the affected resource. This object also provides information such as the owner and geographic location for the IP address.
    */
  var ipAddressDetails: js.UndefOr[IpAddressDetails] = js.native
  /**
    * The type and other characteristics of the entity that performed the action on the affected resource.
    */
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}

object FindingActor {
  @scala.inline
  def apply(): FindingActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingActor]
  }
  @scala.inline
  implicit class FindingActorOps[Self <: FindingActor] (val x: Self) extends AnyVal {
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
    def setDomainDetails(value: DomainDetails): Self = this.set("domainDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainDetails: Self = this.set("domainDetails", js.undefined)
    @scala.inline
    def setIpAddressDetails(value: IpAddressDetails): Self = this.set("ipAddressDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressDetails: Self = this.set("ipAddressDetails", js.undefined)
    @scala.inline
    def setUserIdentity(value: UserIdentity): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIdentity: Self = this.set("userIdentity", js.undefined)
  }
  
}

