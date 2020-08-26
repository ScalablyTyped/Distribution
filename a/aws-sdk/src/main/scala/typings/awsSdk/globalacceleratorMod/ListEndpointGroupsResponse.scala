package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointGroupsResponse extends js.Object {
  /**
    * The list of the endpoint groups associated with a listener.
    */
  var EndpointGroups: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroups] = js.native
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListEndpointGroupsResponse {
  @scala.inline
  def apply(): ListEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointGroupsResponse]
  }
  @scala.inline
  implicit class ListEndpointGroupsResponseOps[Self <: ListEndpointGroupsResponse] (val x: Self) extends AnyVal {
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
    def setEndpointGroupsVarargs(value: EndpointGroup*): Self = this.set("EndpointGroups", js.Array(value :_*))
    @scala.inline
    def setEndpointGroups(value: EndpointGroups): Self = this.set("EndpointGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointGroups: Self = this.set("EndpointGroups", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

