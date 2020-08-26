package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    * The maximum number of tags to return in the response. When there are more tags than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[MaxSize] = js.native
  /**
    * The NextToken value that you received in the previous response. Use this value to get more tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.native
  /**
    * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: typings.awsSdk.cloudhsmv2Mod.ResourceId = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceId: ResourceId): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  @scala.inline
  implicit class ListTagsRequestOps[Self <: ListTagsRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

