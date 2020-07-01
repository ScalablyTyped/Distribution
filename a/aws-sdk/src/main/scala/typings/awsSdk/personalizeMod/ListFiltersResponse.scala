package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFiltersResponse extends js.Object {
  /**
    * A list of returned filters.
    */
  var Filters: js.UndefOr[typings.awsSdk.personalizeMod.Filters] = js.native
  /**
    * A token for getting the next set of filters (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListFiltersResponse {
  @scala.inline
  def apply(Filters: Filters = null, nextToken: NextToken = null): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFiltersResponse]
  }
}

