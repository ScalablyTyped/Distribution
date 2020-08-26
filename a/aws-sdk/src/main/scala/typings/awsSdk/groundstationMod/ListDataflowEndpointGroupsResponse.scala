package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataflowEndpointGroupsResponse extends js.Object {
  /**
    * A list of dataflow endpoint groups.
    */
  var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.native
  /**
    * Next token returned in the response of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListDataflowEndpointGroupsResponse {
  @scala.inline
  def apply(): ListDataflowEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
  }
  @scala.inline
  implicit class ListDataflowEndpointGroupsResponseOps[Self <: ListDataflowEndpointGroupsResponse] (val x: Self) extends AnyVal {
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
    def setDataflowEndpointGroupListVarargs(value: DataflowEndpointListItem*): Self = this.set("dataflowEndpointGroupList", js.Array(value :_*))
    @scala.inline
    def setDataflowEndpointGroupList(value: DataflowEndpointGroupList): Self = this.set("dataflowEndpointGroupList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataflowEndpointGroupList: Self = this.set("dataflowEndpointGroupList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

