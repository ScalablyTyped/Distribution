package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A summary of the data lake resources.
    */
  var ResourceInfoList: js.UndefOr[typings.awsSdk.lakeformationMod.ResourceInfoList] = js.native
}

object ListResourcesResponse {
  @scala.inline
  def apply(NextToken: Token = null, ResourceInfoList: ResourceInfoList = null): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceInfoList != null) __obj.updateDynamic("ResourceInfoList")(ResourceInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesResponse]
  }
}

