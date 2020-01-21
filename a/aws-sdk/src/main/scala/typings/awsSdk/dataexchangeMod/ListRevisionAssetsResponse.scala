package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRevisionAssetsResponse extends js.Object {
  /**
    * The asset objects listed by the request.
    */
  var Assets: js.UndefOr[ListOfAssetEntry] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.native
}

object ListRevisionAssetsResponse {
  @scala.inline
  def apply(Assets: ListOfAssetEntry = null, NextToken: NextToken = null): ListRevisionAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Assets != null) __obj.updateDynamic("Assets")(Assets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRevisionAssetsResponse]
  }
}

