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
import typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreGrantConstraintsMod._UnmarshalledGrantConstraints
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGrantListEntry extends _GrantListEntry {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  @JSName("Constraints")
  var Constraints__UnmarshalledGrantListEntry: js.UndefOr[_UnmarshalledGrantConstraints] = js.undefined
  /**
    * <p>The date and time when the grant was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate__UnmarshalledGrantListEntry: js.UndefOr[Date] = js.undefined
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  @JSName("Operations")
  var Operations__UnmarshalledGrantListEntry: js.UndefOr[
    js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]
  ] = js.undefined
}

object _UnmarshalledGrantListEntry {
  @scala.inline
  def apply(
    Constraints: _UnmarshalledGrantConstraints = null,
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
  ): _UnmarshalledGrantListEntry = {
    val __obj = js.Dynamic.literal()
    if (Constraints != null) __obj.updateDynamic("Constraints")(Constraints)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (GrantId != null) __obj.updateDynamic("GrantId")(GrantId)
    if (GranteePrincipal != null) __obj.updateDynamic("GranteePrincipal")(GranteePrincipal)
    if (IssuingAccount != null) __obj.updateDynamic("IssuingAccount")(IssuingAccount)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Operations != null) __obj.updateDynamic("Operations")(Operations)
    if (RetiringPrincipal != null) __obj.updateDynamic("RetiringPrincipal")(RetiringPrincipal)
    __obj.asInstanceOf[_UnmarshalledGrantListEntry]
  }
}

