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
import typings.awsSdkClientKmsNode.typesGrantConstraintsMod.GrantConstraints
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantListEntry extends js.Object {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.native
  /**
    * <p>The date and time when the grant was created.</p>
    */
  var CreationDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>The unique identifier for the grant.</p>
    */
  var GrantId: js.UndefOr[String] = js.native
  /**
    * <p>The principal that receives the grant's permissions.</p>
    */
  var GranteePrincipal: js.UndefOr[String] = js.native
  /**
    * <p>The AWS account under which the grant was issued.</p>
    */
  var IssuingAccount: js.UndefOr[String] = js.native
  /**
    * <p>The unique identifier for the customer master key (CMK) to which the grant applies.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
  /**
    * <p>The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name is returned. Otherwise this value is null.</p>
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  var Operations: js.UndefOr[
    (js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) | (Iterable[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ])
  ] = js.native
  /**
    * <p>The principal that can retire the grant.</p>
    */
  var RetiringPrincipal: js.UndefOr[String] = js.native
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
    def setCreationDate(value: Date | String | Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setGrantId(value: String): Self = this.set("GrantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantId: Self = this.set("GrantId", js.undefined)
    @scala.inline
    def setGranteePrincipal(value: String): Self = this.set("GranteePrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranteePrincipal: Self = this.set("GranteePrincipal", js.undefined)
    @scala.inline
    def setIssuingAccount(value: String): Self = this.set("IssuingAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuingAccount: Self = this.set("IssuingAccount", js.undefined)
    @scala.inline
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOperationsVarargs(
      value: (Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String)*
    ): Self = this.set("Operations", js.Array(value :_*))
    @scala.inline
    def setOperations(
      value: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): Self = this.set("Operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("Operations", js.undefined)
    @scala.inline
    def setRetiringPrincipal(value: String): Self = this.set("RetiringPrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetiringPrincipal: Self = this.set("RetiringPrincipal", js.undefined)
  }
  
}

