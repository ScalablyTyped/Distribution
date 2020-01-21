package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpsRequest extends js.Object {
  /**
    * A token returned from a previous call to GetDedicatedIps to indicate the position of the dedicated IP pool in the list of IP pools.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to GetDedicatedIpsRequest. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The name of the IP pool that the dedicated IP address is associated with.
    */
  var PoolName: js.UndefOr[typings.awsSdk.sesv2Mod.PoolName] = js.native
}

object GetDedicatedIpsRequest {
  @scala.inline
  def apply(NextToken: NextToken = null, PageSize: Int | Double = null, PoolName: PoolName = null): GetDedicatedIpsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PoolName != null) __obj.updateDynamic("PoolName")(PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpsRequest]
  }
}

