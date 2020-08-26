package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactFlowsRequest extends js.Object {
  /**
    * The type of contact flow.
    */
  var ContactFlowTypes: js.UndefOr[typings.awsSdk.connectMod.ContactFlowTypes] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.native
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}

object ListContactFlowsRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): ListContactFlowsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactFlowsRequest]
  }
  @scala.inline
  implicit class ListContactFlowsRequestOps[Self <: ListContactFlowsRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContactFlowTypesVarargs(value: ContactFlowType*): Self = this.set("ContactFlowTypes", js.Array(value :_*))
    @scala.inline
    def setContactFlowTypes(value: ContactFlowTypes): Self = this.set("ContactFlowTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactFlowTypes: Self = this.set("ContactFlowTypes", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResult1000): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

