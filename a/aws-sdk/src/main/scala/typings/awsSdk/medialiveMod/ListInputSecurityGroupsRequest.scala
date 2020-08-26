package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputSecurityGroupsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputSecurityGroupsRequest {
  @scala.inline
  def apply(): ListInputSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputSecurityGroupsRequest]
  }
  @scala.inline
  implicit class ListInputSecurityGroupsRequestOps[Self <: ListInputSecurityGroupsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

