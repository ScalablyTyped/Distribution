package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFiltersResponse extends js.Object {
  /**
    * A list of filter names.
    */
  var FilterNames: typings.awsSdk.guarddutyMod.FilterNames = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFiltersResponse {
  @scala.inline
  def apply(FilterNames: FilterNames, NextToken: String = null): ListFiltersResponse = {
    val __obj = js.Dynamic.literal(FilterNames = FilterNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFiltersResponse]
  }
}

