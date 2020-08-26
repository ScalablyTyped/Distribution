package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointGroupsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString = js.native
  /**
    * The number of endpoint group objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.globalacceleratorMod.MaxResults] = js.native
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListEndpointGroupsRequest {
  @scala.inline
  def apply(ListenerArn: GenericString): ListEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointGroupsRequest]
  }
  @scala.inline
  implicit class ListEndpointGroupsRequestOps[Self <: ListEndpointGroupsRequest] (val x: Self) extends AnyVal {
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
    def setListenerArn(value: GenericString): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

