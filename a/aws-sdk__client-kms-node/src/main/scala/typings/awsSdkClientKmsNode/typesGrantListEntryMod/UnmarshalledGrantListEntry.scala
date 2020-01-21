package typings.awsSdkClientKmsNode.typesGrantListEntryMod

import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CreateGrant
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Decrypt
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DescribeKey
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Encrypt
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKey
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKeyWithoutPlaintext
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptFrom
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptTo
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RetireGrant
import typings.awsSdkClientKmsNode.typesGrantConstraintsMod.UnmarshalledGrantConstraints
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGrantListEntry extends GrantListEntry {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  @JSName("Constraints")
  var Constraints_UnmarshalledGrantListEntry: js.UndefOr[UnmarshalledGrantConstraints] = js.undefined
  /**
    * <p>The date and time when the grant was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledGrantListEntry: js.UndefOr[Date] = js.undefined
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  @JSName("Operations")
  var Operations_UnmarshalledGrantListEntry: js.UndefOr[
    js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]
  ] = js.undefined
}

object UnmarshalledGrantListEntry {
  @scala.inline
  def apply(
    Constraints: UnmarshalledGrantConstraints = null,
    CreationDate: Date = null,
    GrantId: String = null,
    GranteePrincipal: String = null,
    IssuingAccount: String = null,
    KeyId: String = null,
    Name: String = null,
    Operations: js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ] = null,
    RetiringPrincipal: String = null
  ): UnmarshalledGrantListEntry = {
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
    __obj.asInstanceOf[UnmarshalledGrantListEntry]
  }
}

