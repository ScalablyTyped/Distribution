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
  def apply(MaxResults: Int | Double = null, NextToken: Token = null): ListSitesInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSitesInput]
  }
}

