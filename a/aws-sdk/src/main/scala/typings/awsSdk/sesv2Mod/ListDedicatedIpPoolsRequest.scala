package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDedicatedIpPoolsRequest extends js.Object {
  /**
    * A token returned from a previous call to ListDedicatedIpPools to indicate the position in the list of dedicated IP pools.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListDedicatedIpPools. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}

object ListDedicatedIpPoolsRequest {
  @scala.inline
  def apply(NextToken: NextToken = null, PageSize: Int | Double = null): ListDedicatedIpPoolsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDedicatedIpPoolsRequest]
  }
}

