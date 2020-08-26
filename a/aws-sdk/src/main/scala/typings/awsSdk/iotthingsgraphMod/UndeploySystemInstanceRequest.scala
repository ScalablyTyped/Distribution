package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeploySystemInstanceRequest extends js.Object {
  /**
    * The ID of the system instance to remove from its target.
    */
  var id: js.UndefOr[Urn] = js.native
}

object UndeploySystemInstanceRequest {
  @scala.inline
  def apply(): UndeploySystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeploySystemInstanceRequest]
  }
  @scala.inline
  implicit class UndeploySystemInstanceRequestOps[Self <: UndeploySystemInstanceRequest] (val x: Self) extends AnyVal {
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
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

