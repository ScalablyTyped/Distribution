package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReceiptFiltersResponse extends js.Object {
  /**
    * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filters: js.UndefOr[ReceiptFilterList] = js.native
}

object ListReceiptFiltersResponse {
  @scala.inline
  def apply(Filters: ReceiptFilterList = null): ListReceiptFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReceiptFiltersResponse]
  }
}

