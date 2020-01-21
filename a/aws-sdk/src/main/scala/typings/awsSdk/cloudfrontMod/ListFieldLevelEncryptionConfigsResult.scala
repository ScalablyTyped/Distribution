package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFieldLevelEncryptionConfigsResult extends js.Object {
  /**
    * Returns a list of all field-level encryption configurations that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionList: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionList] = js.native
}

object ListFieldLevelEncryptionConfigsResult {
  @scala.inline
  def apply(FieldLevelEncryptionList: FieldLevelEncryptionList = null): ListFieldLevelEncryptionConfigsResult = {
    val __obj = js.Dynamic.literal()
    if (FieldLevelEncryptionList != null) __obj.updateDynamic("FieldLevelEncryptionList")(FieldLevelEncryptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
  }
}

