package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalThingsRequest extends js.Object {
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The principal.
    */
  var principal: Principal = js.native
}

object ListPrincipalThingsRequest {
  @scala.inline
  def apply(principal: Principal, maxResults: Int | Double = null, nextToken: NextToken = null): ListPrincipalThingsRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalThingsRequest]
  }
}

