package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProtectionRequest extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object to be deleted.
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId = js.native
}

object DeleteProtectionRequest {
  @scala.inline
  def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
    val __obj = js.Dynamic.literal(ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectionRequest]
  }
  @scala.inline
  implicit class DeleteProtectionRequestOps[Self <: DeleteProtectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProtectionId(value: ProtectionId): Self = this.set("ProtectionId", value.asInstanceOf[js.Any])
  }
  
}

