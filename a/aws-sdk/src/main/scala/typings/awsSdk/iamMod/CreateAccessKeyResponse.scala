package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessKeyResponse extends js.Object {
  /**
    * A structure with details about the access key.
    */
  var AccessKey: typings.awsSdk.iamMod.AccessKey = js.native
}

object CreateAccessKeyResponse {
  @scala.inline
  def apply(AccessKey: AccessKey): CreateAccessKeyResponse = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessKeyResponse]
  }
  @scala.inline
  implicit class CreateAccessKeyResponseOps[Self <: CreateAccessKeyResponse] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: AccessKey): Self = this.set("AccessKey", value.asInstanceOf[js.Any])
  }
  
}

