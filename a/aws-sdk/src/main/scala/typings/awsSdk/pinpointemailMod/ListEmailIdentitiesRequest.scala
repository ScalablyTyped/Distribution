package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEmailIdentitiesRequest extends js.Object {
  /**
    * A token returned from a previous call to ListEmailIdentities to indicate the position in the list of identities.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListEmailIdentities. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 0, and can be no more than 1000.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}

object ListEmailIdentitiesRequest {
  @scala.inline
  def apply(NextToken: NextToken = null, PageSize: js.UndefOr[MaxItems] = js.undefined): ListEmailIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEmailIdentitiesRequest]
  }
}

