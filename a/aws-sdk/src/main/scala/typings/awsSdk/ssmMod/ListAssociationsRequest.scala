package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociationsRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var AssociationFilterList: js.UndefOr[typings.awsSdk.ssmMod.AssociationFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListAssociationsRequest {
  @scala.inline
  def apply(
    AssociationFilterList: AssociationFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationFilterList != null) __obj.updateDynamic("AssociationFilterList")(AssociationFilterList.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociationsRequest]
  }
}

