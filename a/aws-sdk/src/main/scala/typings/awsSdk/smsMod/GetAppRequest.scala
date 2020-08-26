package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppRequest extends js.Object {
  /**
    * ID of the application whose information is being retrieved.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object GetAppRequest {
  @scala.inline
  def apply(): GetAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppRequest]
  }
  @scala.inline
  implicit class GetAppRequestOps[Self <: GetAppRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
  }
  
}

