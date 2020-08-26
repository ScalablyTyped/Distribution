package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption profile information.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.native
}

object GetFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(): GetFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
  }
  @scala.inline
  implicit class GetFieldLevelEncryptionProfileResultOps[Self <: GetFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = this.set("FieldLevelEncryptionProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelEncryptionProfile: Self = this.set("FieldLevelEncryptionProfile", js.undefined)
  }
  
}

