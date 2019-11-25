package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEncryptionConfigMod

import typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.ACTIVE
import typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.KMS
import typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.NONE
import typings.atAwsDashSdkClientDashXrayDashNode.atAwsDashSdkClientDashXrayDashNodeStrings.UPDATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EncryptionConfig extends js.Object {
  /**
    * <p>The ID of the customer master key (CMK) used for encryption, if applicable.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of the new and old settings.</p>
    */
  var Status: js.UndefOr[UPDATING | ACTIVE | String] = js.undefined
  /**
    * <p>The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default encryption.</p>
    */
  var Type: js.UndefOr[NONE | KMS | String] = js.undefined
}

object _EncryptionConfig {
  @scala.inline
  def apply(KeyId: String = null, Status: UPDATING | ACTIVE | String = null, Type: NONE | KMS | String = null): _EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EncryptionConfig]
  }
}

