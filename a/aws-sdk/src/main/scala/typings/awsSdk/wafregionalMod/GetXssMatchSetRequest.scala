package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetXssMatchSetRequest extends js.Object {
  /**
    * The XssMatchSetId of the XssMatchSet that you want to get. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId = js.native
}

object GetXssMatchSetRequest {
  @scala.inline
  def apply(XssMatchSetId: ResourceId): GetXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetXssMatchSetRequest]
  }
  @scala.inline
  implicit class GetXssMatchSetRequestOps[Self <: GetXssMatchSetRequest] (val x: Self) extends AnyVal {
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
    def setXssMatchSetId(value: ResourceId): Self = this.set("XssMatchSetId", value.asInstanceOf[js.Any])
  }
  
}

