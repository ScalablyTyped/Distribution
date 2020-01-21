package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordHistorySearchFilter extends js.Object {
  /**
    * The filter key.    product - Filter results based on the specified product identifier.    provisionedproduct - Filter results based on the provisioned product identifier.  
    */
  var Key: js.UndefOr[SearchFilterKey] = js.native
  /**
    * The filter value.
    */
  var Value: js.UndefOr[SearchFilterValue] = js.native
}

object ListRecordHistorySearchFilter {
  @scala.inline
  def apply(Key: SearchFilterKey = null, Value: SearchFilterValue = null): ListRecordHistorySearchFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecordHistorySearchFilter]
  }
}

