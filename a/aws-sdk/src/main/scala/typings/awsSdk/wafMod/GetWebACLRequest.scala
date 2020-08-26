package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLRequest extends js.Object {
  /**
    * The WebACLId of the WebACL that you want to get. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId = js.native
}

object GetWebACLRequest {
  @scala.inline
  def apply(WebACLId: ResourceId): GetWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebACLRequest]
  }
  @scala.inline
  implicit class GetWebACLRequestOps[Self <: GetWebACLRequest] (val x: Self) extends AnyVal {
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
    def setWebACLId(value: ResourceId): Self = this.set("WebACLId", value.asInstanceOf[js.Any])
  }
  
}

