package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebACLsRequest extends js.Object {
  /**
    * Specifies the number of WebACL objects that you want AWS WAF to return for this request. If you have more WebACL objects than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of WebACL objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * If you specify a value for Limit and you have more WebACL objects than the number that you specify for Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of WebACL objects. For the second and subsequent ListWebACLs requests, specify the value of NextMarker from the previous response to get information about another batch of WebACL objects.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
}

object ListWebACLsRequest {
  @scala.inline
  def apply(): ListWebACLsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebACLsRequest]
  }
  @scala.inline
  implicit class ListWebACLsRequestOps[Self <: ListWebACLsRequest] (val x: Self) extends AnyVal {
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
    def setLimit(value: PaginationLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

