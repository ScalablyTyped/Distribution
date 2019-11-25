package typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreGrantListEntryMod

import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.CreateGrant
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.Decrypt
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.DescribeKey
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.Encrypt
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.GenerateDataKey
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.GenerateDataKeyWithoutPlaintext
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.ReEncryptFrom
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.ReEncryptTo
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.RetireGrant
import typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreGrantConstraintsMod._GrantConstraints
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GrantListEntry extends js.Object {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  var Constraints: js.UndefOr[_GrantConstraints] = js.undefined
  /**
    * <p>The date and time when the grant was created.</p>
    */
  var CreationDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The unique identifier for the grant.</p>
    */
  var GrantId: js.UndefOr[String] = js.undefined
  /**
    * <p>The principal that receives the grant's permissions.</p>
    */
  var GranteePrincipal: js.UndefOr[String] = js.undefined
  /**
    * <p>The AWS account under which the grant was issued.</p>
    */
  var IssuingAccount: js.UndefOr[String] = js.undefined
  /**
    * <p>The unique identifier for the customer master key (CMK) to which the grant applies.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name is returned. Otherwise this value is null.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  var Operations: js.UndefOr[
    (js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) | (Iterable[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ])
  ] = js.undefined
  /**
    * <p>The principal that can retire the grant.</p>
    */
  var RetiringPrincipal: js.UndefOr[String] = js.undefined
}

object _GrantListEntry {
  @scala.inline
  def apply(
    Constraints: _GrantConstraints = null,
    CreationDate: Date | String | Double = null,
    GrantId: String = null,
    GranteePrincipal: String = null,
    IssuingAccount: String = null,
    KeyId: String = null,
    Name: String = null,
    Operations: (js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) | (Iterable[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) = null,
    RetiringPrincipal: String = null
  ): _GrantListEntry = {
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
    __obj.asInstanceOf[_GrantListEntry]
  }
}

