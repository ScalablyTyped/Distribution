package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryptionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig] = js.native
}

object GetFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(): GetFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
  }
  @scala.inline
  implicit class GetFieldLevelEncryptionConfigResultOps[Self <: GetFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
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
    def setFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = this.set("FieldLevelEncryptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelEncryptionConfig: Self = this.set("FieldLevelEncryptionConfig", js.undefined)
  }
  
}

