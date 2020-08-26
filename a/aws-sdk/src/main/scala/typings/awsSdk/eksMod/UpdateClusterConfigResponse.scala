package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterConfigResponse extends js.Object {
  var update: js.UndefOr[Update] = js.native
}

object UpdateClusterConfigResponse {
  @scala.inline
  def apply(): UpdateClusterConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterConfigResponse]
  }
  @scala.inline
  implicit class UpdateClusterConfigResponseOps[Self <: UpdateClusterConfigResponse] (val x: Self) extends AnyVal {
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
    def setUpdate(value: Update): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

