package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentsRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var DocumentFilterList: js.UndefOr[typings.awsSdk.ssmMod.DocumentFilterList] = js.native
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListDocumentsRequest {
  @scala.inline
  def apply(
    DocumentFilterList: DocumentFilterList = null,
    Filters: DocumentKeyValuesFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (DocumentFilterList != null) __obj.updateDynamic("DocumentFilterList")(DocumentFilterList.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentsRequest]
  }
}

