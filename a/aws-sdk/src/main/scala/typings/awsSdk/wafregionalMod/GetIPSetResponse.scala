package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetResponse extends js.Object {
  /**
    * Information about the IPSet that you specified in the GetIPSet request. For more information, see the following topics:    IPSet: Contains IPSetDescriptors, IPSetId, and Name     IPSetDescriptors: Contains an array of IPSetDescriptor objects. Each IPSetDescriptor object contains Type and Value   
    */
  var IPSet: js.UndefOr[typings.awsSdk.wafregionalMod.IPSet] = js.native
}

object GetIPSetResponse {
  @scala.inline
  def apply(): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIPSetResponse]
  }
  @scala.inline
  implicit class GetIPSetResponseOps[Self <: GetIPSetResponse] (val x: Self) extends AnyVal {
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
    def setIPSet(value: IPSet): Self = this.set("IPSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPSet: Self = this.set("IPSet", js.undefined)
  }
  
}

