package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSitesInput extends js.Object {
  var MaxResults: js.UndefOr[MaxResults1000] = js.native
  var NextToken: js.UndefOr[Token] = js.native
}

object ListSitesInput {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults1000] = js.undefined, NextToken: Token = null): ListSitesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSitesInput]
  }
}

