package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFieldLevelEncryptionProfilesResult extends js.Object {
  /**
    * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionProfileList: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileList] = js.native
}

object ListFieldLevelEncryptionProfilesResult {
  @scala.inline
  def apply(): ListFieldLevelEncryptionProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesResult]
  }
  @scala.inline
  implicit class ListFieldLevelEncryptionProfilesResultOps[Self <: ListFieldLevelEncryptionProfilesResult] (val x: Self) extends AnyVal {
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
    def setFieldLevelEncryptionProfileList(value: FieldLevelEncryptionProfileList): Self = this.set("FieldLevelEncryptionProfileList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelEncryptionProfileList: Self = this.set("FieldLevelEncryptionProfileList", js.undefined)
  }
  
}

