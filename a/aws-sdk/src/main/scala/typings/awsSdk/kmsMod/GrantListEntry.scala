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
    * The principal that receives the grant's permissions.
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
  def apply(
    Constraints: GrantConstraints = null,
    CreationDate: DateType = null,
    GrantId: GrantIdType = null,
    GranteePrincipal: PrincipalIdType = null,
    IssuingAccount: PrincipalIdType = null,
    KeyId: KeyIdType = null,
    Name: GrantNameType = null,
    Operations: GrantOperationList = null,
    RetiringPrincipal: PrincipalIdType = null
  ): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    if (Constraints != null) __obj.updateDynamic("Constraints")(Constraints.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (GrantId != null) __obj.updateDynamic("GrantId")(GrantId.asInstanceOf[js.Any])
    if (GranteePrincipal != null) __obj.updateDynamic("GranteePrincipal")(GranteePrincipal.asInstanceOf[js.Any])
    if (IssuingAccount != null) __obj.updateDynamic("IssuingAccount")(IssuingAccount.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Operations != null) __obj.updateDynamic("Operations")(Operations.asInstanceOf[js.Any])
    if (RetiringPrincipal != null) __obj.updateDynamic("RetiringPrincipal")(RetiringPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantListEntry]
  }
}

