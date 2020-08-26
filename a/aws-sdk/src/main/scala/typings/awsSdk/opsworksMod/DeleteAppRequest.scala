package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppRequest extends js.Object {
  /**
    * The app ID.
    */
  var AppId: String = js.native
}

object DeleteAppRequest {
  @scala.inline
  def apply(AppId: String): DeleteAppRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppRequest]
  }
  @scala.inline
  implicit class DeleteAppRequestOps[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("AppId", value.asInstanceOf[js.Any])
  }
  
}

