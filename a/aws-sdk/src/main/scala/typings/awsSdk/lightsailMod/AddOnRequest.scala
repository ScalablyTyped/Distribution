package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOnRequest extends js.Object {
  /**
    * The add-on type.
    */
  var addOnType: AddOnType = js.native
  /**
    * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
    */
  var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest] = js.native
}

object AddOnRequest {
  @scala.inline
  def apply(addOnType: AddOnType): AddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnRequest]
  }
  @scala.inline
  implicit class AddOnRequestOps[Self <: AddOnRequest] (val x: Self) extends AnyVal {
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
    def setAddOnType(value: AddOnType): Self = this.set("addOnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSnapshotAddOnRequest(value: AutoSnapshotAddOnRequest): Self = this.set("autoSnapshotAddOnRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSnapshotAddOnRequest: Self = this.set("autoSnapshotAddOnRequest", js.undefined)
  }
  
}

