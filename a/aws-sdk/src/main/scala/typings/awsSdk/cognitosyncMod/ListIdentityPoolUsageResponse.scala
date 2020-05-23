package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolUsageResponse extends js.Object {
  /**
    * Total number of identities for the identity pool.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * Usage information for the identity pools.
    */
  var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.native
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIdentityPoolUsageResponse {
  @scala.inline
  def apply(
    Count: js.UndefOr[Integer] = js.undefined,
    IdentityPoolUsages: IdentityPoolUsageList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): ListIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (IdentityPoolUsages != null) __obj.updateDynamic("IdentityPoolUsages")(IdentityPoolUsages.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolUsageResponse]
  }
}

