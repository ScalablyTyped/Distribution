package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbDomainMembership extends js.Object {
  
  /**
    * The identifier of the Active Directory domain.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The fully qualified domain name of the Active Directory domain.
    */
  var Fqdn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the IAM role to use when making API calls to the Directory Service.
    */
  var IamRoleName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the Active Directory Domain membership for the DB instance.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbDomainMembership {
  
  @scala.inline
  def apply(): AwsRdsDbDomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbDomainMembership]
  }
  
  @scala.inline
  implicit class AwsRdsDbDomainMembershipOps[Self <: AwsRdsDbDomainMembership] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: NonEmptyString): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setFqdn(value: NonEmptyString): Self = this.set("Fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFqdn: Self = this.set("Fqdn", js.undefined)
    
    @scala.inline
    def setIamRoleName(value: NonEmptyString): Self = this.set("IamRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleName: Self = this.set("IamRoleName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
