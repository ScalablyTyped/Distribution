package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHITsForQualificationTypeResponse extends js.Object {
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListHITsForQualificationTypeResponse {
  @scala.inline
  def apply(
    HITs: HITList = null,
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined
  ): ListHITsForQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (HITs != null) __obj.updateDynamic("HITs")(HITs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsForQualificationTypeResponse]
  }
}

