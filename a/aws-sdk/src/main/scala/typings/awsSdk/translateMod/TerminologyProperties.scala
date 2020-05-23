package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminologyProperties extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the custom terminology. 
    */
  var Arn: js.UndefOr[TerminologyArn] = js.native
  /**
    * The time at which the custom terminology was created, based on the timestamp.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the custom terminology properties.
    */
  var Description: js.UndefOr[typings.awsSdk.translateMod.Description] = js.native
  /**
    * The encryption key for the custom terminology.
    */
  var EncryptionKey: js.UndefOr[typings.awsSdk.translateMod.EncryptionKey] = js.native
  /**
    * The time at which the custom terminology was last update, based on the timestamp.
    */
  var LastUpdatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the custom terminology.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The size of the file used when importing a custom terminology.
    */
  var SizeBytes: js.UndefOr[Integer] = js.native
  /**
    * The language code for the source text of the translation request for which the custom terminology is being used.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.native
  /**
    * The language codes for the target languages available with the custom terminology file. All possible target languages are returned in array.
    */
  var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.native
  /**
    * The number of terms included in the custom terminology.
    */
  var TermCount: js.UndefOr[Integer] = js.native
}

object TerminologyProperties {
  @scala.inline
  def apply(
    Arn: TerminologyArn = null,
    CreatedAt: Timestamp = null,
    Description: Description = null,
    EncryptionKey: EncryptionKey = null,
    LastUpdatedAt: Timestamp = null,
    Name: ResourceName = null,
    SizeBytes: js.UndefOr[Integer] = js.undefined,
    SourceLanguageCode: LanguageCodeString = null,
    TargetLanguageCodes: LanguageCodeStringList = null,
    TermCount: js.UndefOr[Integer] = js.undefined
  ): TerminologyProperties = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EncryptionKey != null) __obj.updateDynamic("EncryptionKey")(EncryptionKey.asInstanceOf[js.Any])
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeBytes)) __obj.updateDynamic("SizeBytes")(SizeBytes.get.asInstanceOf[js.Any])
    if (SourceLanguageCode != null) __obj.updateDynamic("SourceLanguageCode")(SourceLanguageCode.asInstanceOf[js.Any])
    if (TargetLanguageCodes != null) __obj.updateDynamic("TargetLanguageCodes")(TargetLanguageCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(TermCount)) __obj.updateDynamic("TermCount")(TermCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyProperties]
  }
}

