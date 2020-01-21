package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMembership extends js.Object {
  /**
    * The identifier of the Active Directory Domain.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * The fully qualified domain name of the Active Directory Domain.
    */
  var FQDN: js.UndefOr[String] = js.native
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  var IAMRoleName: js.UndefOr[String] = js.native
  /**
    * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
    */
  var Status: js.UndefOr[String] = js.native
}

object DomainMembership {
  @scala.inline
  def apply(Domain: String = null, FQDN: String = null, IAMRoleName: String = null, Status: String = null): DomainMembership = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (FQDN != null) __obj.updateDynamic("FQDN")(FQDN.asInstanceOf[js.Any])
    if (IAMRoleName != null) __obj.updateDynamic("IAMRoleName")(IAMRoleName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMembership]
  }
}

