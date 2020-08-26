package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceDefinitionVersionsRequest extends js.Object {
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string = js.native
}

object ListResourceDefinitionVersionsRequest {
  @scala.inline
  def apply(ResourceDefinitionId: string): ListResourceDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceDefinitionVersionsRequest]
  }
  @scala.inline
  implicit class ListResourceDefinitionVersionsRequestOps[Self <: ListResourceDefinitionVersionsRequest] (val x: Self) extends AnyVal {
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
    def setResourceDefinitionId(value: string): Self = this.set("ResourceDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: string): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

