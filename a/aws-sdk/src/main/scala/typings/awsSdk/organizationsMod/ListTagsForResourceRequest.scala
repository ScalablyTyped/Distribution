package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * The ID of the resource that you want to retrieve tags for. 
    */
  var ResourceId: TaggableResourceId = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: TaggableResourceId, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

