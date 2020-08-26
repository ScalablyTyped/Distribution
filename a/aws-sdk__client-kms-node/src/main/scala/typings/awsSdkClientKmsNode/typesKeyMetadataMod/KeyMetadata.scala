package typings.awsSdkClientKmsNode.typesKeyMetadataMod

import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AWS
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AWS_KMS
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CUSTOMER
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Disabled
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ENCRYPT_DECRYPT
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.EXTERNAL
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Enabled
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KEY_MATERIAL_EXPIRES
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.PendingDeletion
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.PendingImport
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMetadata extends js.Object {
  /**
    * <p>The twelve-digit account ID of the AWS account that owns the CMK.</p>
    */
  var AWSAccountId: js.UndefOr[String] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the CMK. For examples, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.</p>
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * <p>The date and time when the CMK was created.</p>
    */
  var CreationDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
    */
  var DeletionDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>The description of the CMK.</p>
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * <p>Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true, otherwise it is false.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * <p>Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise this value is omitted.</p>
    */
  var ExpirationModel: js.UndefOr[KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String] = js.native
  /**
    * <p>The globally unique identifier for the CMK.</p>
    */
  var KeyId: String = js.native
  /**
    * <p>The CMK's manager. CMKs are either customer managed or AWS managed. For more information about the difference, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var KeyManager: js.UndefOr[AWS | CUSTOMER | String] = js.native
  /**
    * <p>The state of the CMK.</p> <p>For more information about how key state affects the use of a CMK, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var KeyState: js.UndefOr[Enabled | Disabled | PendingDeletion | PendingImport | String] = js.native
  /**
    * <p>The cryptographic operations for which you can use the CMK. Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a> operations.</p>
    */
  var KeyUsage: js.UndefOr[ENCRYPT_DECRYPT | String] = js.native
  /**
    * <p>The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management infrastructure or the CMK lacks key material.</p>
    */
  var Origin: js.UndefOr[AWS_KMS | EXTERNAL | String] = js.native
  /**
    * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
    */
  var ValidTo: js.UndefOr[Date | String | Double] = js.native
}

object KeyMetadata {
  @scala.inline
  def apply(KeyId: String): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMetadata]
  }
  @scala.inline
  implicit class KeyMetadataOps[Self <: KeyMetadata] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAWSAccountId(value: String): Self = this.set("AWSAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAWSAccountId: Self = this.set("AWSAccountId", js.undefined)
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationDate(value: Date | String | Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDeletionDate(value: Date | String | Double): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setExpirationModel(value: KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String): Self = this.set("ExpirationModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationModel: Self = this.set("ExpirationModel", js.undefined)
    @scala.inline
    def setKeyManager(value: AWS | CUSTOMER | String): Self = this.set("KeyManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyManager: Self = this.set("KeyManager", js.undefined)
    @scala.inline
    def setKeyState(value: Enabled | Disabled | PendingDeletion | PendingImport | String): Self = this.set("KeyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyState: Self = this.set("KeyState", js.undefined)
    @scala.inline
    def setKeyUsage(value: ENCRYPT_DECRYPT | String): Self = this.set("KeyUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyUsage: Self = this.set("KeyUsage", js.undefined)
    @scala.inline
    def setOrigin(value: AWS_KMS | EXTERNAL | String): Self = this.set("Origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("Origin", js.undefined)
    @scala.inline
    def setValidTo(value: Date | String | Double): Self = this.set("ValidTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidTo: Self = this.set("ValidTo", js.undefined)
  }
  
}

