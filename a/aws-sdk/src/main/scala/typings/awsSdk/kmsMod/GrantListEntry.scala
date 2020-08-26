package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantListEntry extends js.Object {
  /**
    * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.native
  /**
    * The date and time when the grant was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * The unique identifier for the grant.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  /**
    * The identity that gets the permissions in the grant. The GranteePrincipal field in the ListGrants response usually contains the user or role designated as the grantee principal in the grant. However, when the grantee principal in the grant is an AWS service, the GranteePrincipal field contains the service principal, which might represent several different grantee principals.
    */
  var GranteePrincipal: js.UndefOr[PrincipalIdType] = js.native
  /**
    * The AWS account under which the grant was issued.
    */
  var IssuingAccount: js.UndefOr[PrincipalIdType] = js.native
  /**
    * The unique identifier for the customer master key (CMK) to which the grant applies.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The friendly name that identifies the grant. If a name was provided in the CreateGrant request, that name is returned. Otherwise this value is null.
    */
  var Name: js.UndefOr[GrantNameType] = js.native
  /**
    * The list of operations permitted by the grant.
    */
  var Operations: js.UndefOr[GrantOperationList] = js.native
  /**
    * The principal that can retire the grant.
    */
  var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.native
}

object GrantListEntry {
  @scala.inline
  def apply(): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantListEntry]
  }
  @scala.inline
  implicit class GrantListEntryOps[Self <: GrantListEntry] (val x: Self) extends AnyVal {
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
    def setConstraints(value: GrantConstraints): Self = this.set("Constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("Constraints", js.undefined)
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setGrantId(value: GrantIdType): Self = this.set("GrantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantId: Self = this.set("GrantId", js.undefined)
    @scala.inline
    def setGranteePrincipal(value: PrincipalIdType): Self = this.set("GranteePrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranteePrincipal: Self = this.set("GranteePrincipal", js.undefined)
    @scala.inline
    def setIssuingAccount(value: PrincipalIdType): Self = this.set("IssuingAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuingAccount: Self = this.set("IssuingAccount", js.undefined)
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setName(value: GrantNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: GrantOperation*): Self = this.set("Operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: GrantOperationList): Self = this.set("Operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("Operations", js.undefined)
    @scala.inline
    def setRetiringPrincipal(value: PrincipalIdType): Self = this.set("RetiringPrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetiringPrincipal: Self = this.set("RetiringPrincipal", js.undefined)
  }
  
}

