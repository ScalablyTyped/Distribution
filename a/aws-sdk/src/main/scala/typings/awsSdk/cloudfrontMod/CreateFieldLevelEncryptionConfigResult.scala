package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Returned when you create a new field-level encryption configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.native
  /**
    * The fully qualified URI of the new configuration resource just created.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(): CreateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigResult]
  }
  @scala.inline
  implicit class CreateFieldLevelEncryptionConfigResultOps[Self <: CreateFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
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
    def setFieldLevelEncryption(value: FieldLevelEncryption): Self = this.set("FieldLevelEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelEncryption: Self = this.set("FieldLevelEncryption", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
  
}

