package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsResponse extends js.Object {
  /**
    *  Array of ChangeSetSummaryListItem objects.
    */
  var ChangeSetSummaryList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetSummaryList] = js.native
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
}

object ListChangeSetsResponse {
  @scala.inline
  def apply(ChangeSetSummaryList: ChangeSetSummaryList = null, NextToken: NextToken = null): ListChangeSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetSummaryList != null) __obj.updateDynamic("ChangeSetSummaryList")(ChangeSetSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsResponse]
  }
}

