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
}

