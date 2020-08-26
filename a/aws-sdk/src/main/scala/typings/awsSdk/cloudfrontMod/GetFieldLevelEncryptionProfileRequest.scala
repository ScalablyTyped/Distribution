package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * Get the ID for the field-level encryption profile information.
    */
  var Id: String = js.native
}

object GetFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileRequest]
  }
  @scala.inline
  implicit class GetFieldLevelEncryptionProfileRequestOps[Self <: GetFieldLevelEncryptionProfileRequest] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

