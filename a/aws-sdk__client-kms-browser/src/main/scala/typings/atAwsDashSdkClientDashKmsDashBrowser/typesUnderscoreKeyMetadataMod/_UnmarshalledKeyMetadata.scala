package typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreKeyMetadataMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.AWS
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.AWS_KMS
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.CUSTOMER
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.ENCRYPT_DECRYPT
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.EXTERNAL
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.Enabled
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.KEY_MATERIAL_EXPIRES
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.PendingDeletion
import typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.PendingImport
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledKeyMetadata extends _KeyMetadata {
  /**
    * <p>The date and time when the CMK was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate__UnmarshalledKeyMetadata: js.UndefOr[Date] = js.undefined
  /**
    * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
    */
  @JSName("DeletionDate")
  var DeletionDate__UnmarshalledKeyMetadata: js.UndefOr[Date] = js.undefined
  /**
    * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
    */
  @JSName("ValidTo")
  var ValidTo__UnmarshalledKeyMetadata: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledKeyMetadata {
  @scala.inline
  def apply(
    KeyId: String,
    AWSAccountId: String = null,
    Arn: String = null,
    CreationDate: Date = null,
    DeletionDate: Date = null,
    Description: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    ExpirationModel: KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String = null,
    KeyManager: AWS | CUSTOMER | String = null,
    KeyState: Enabled | Disabled | PendingDeletion | PendingImport | String = null,
    KeyUsage: ENCRYPT_DECRYPT | String = null,
    Origin: AWS_KMS | EXTERNAL | String = null,
    ValidTo: Date = null
  ): _UnmarshalledKeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    if (AWSAccountId != null) __obj.updateDynamic("AWSAccountId")(AWSAccountId.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (ExpirationModel != null) __obj.updateDynamic("ExpirationModel")(ExpirationModel.asInstanceOf[js.Any])
    if (KeyManager != null) __obj.updateDynamic("KeyManager")(KeyManager.asInstanceOf[js.Any])
    if (KeyState != null) __obj.updateDynamic("KeyState")(KeyState.asInstanceOf[js.Any])
    if (KeyUsage != null) __obj.updateDynamic("KeyUsage")(KeyUsage.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (ValidTo != null) __obj.updateDynamic("ValidTo")(ValidTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledKeyMetadata]
  }
}

