package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsRequest extends js.Object {
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListDomainsMaxResults] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDomainsRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[ListDomainsMaxResults] = js.undefined, nextToken: PaginationToken = null): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsRequest]
  }
}

