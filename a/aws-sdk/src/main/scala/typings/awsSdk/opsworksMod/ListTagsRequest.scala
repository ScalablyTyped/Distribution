package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    * Do not use. A validation exception occurs if you add a MaxResults parameter to a ListTagsRequest call. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opsworksMod.MaxResults] = js.native
  /**
    * Do not use. A validation exception occurs if you add a NextToken parameter to a ListTagsRequest call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opsworksMod.NextToken] = js.native
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsSdk.opsworksMod.ResourceArn = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
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
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

