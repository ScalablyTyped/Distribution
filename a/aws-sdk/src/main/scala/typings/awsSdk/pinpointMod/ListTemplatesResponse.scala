package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesResponse extends js.Object {
  var TemplatesResponse: typings.awsSdk.pinpointMod.TemplatesResponse = js.native
}

object ListTemplatesResponse {
  @scala.inline
  def apply(TemplatesResponse: TemplatesResponse): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal(TemplatesResponse = TemplatesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  @scala.inline
  implicit class ListTemplatesResponseOps[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
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
    def setTemplatesResponse(value: TemplatesResponse): Self = this.set("TemplatesResponse", value.asInstanceOf[js.Any])
  }
  
}

