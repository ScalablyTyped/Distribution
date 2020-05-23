package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifiersRequest extends js.Object {
  /**
    * The size of the list to return (optional).
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * An optional continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetClassifiersRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[PageSize] = js.undefined, NextToken: Token = null): GetClassifiersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassifiersRequest]
  }
}

