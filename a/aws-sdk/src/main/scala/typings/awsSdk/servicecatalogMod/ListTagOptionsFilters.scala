package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagOptionsFilters extends js.Object {
  /**
    * The active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.native
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.native
}

object ListTagOptionsFilters {
  @scala.inline
  def apply(
    Active: js.UndefOr[TagOptionActive] = js.undefined,
    Key: TagOptionKey = null,
    Value: TagOptionValue = null
  ): ListTagOptionsFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.get.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagOptionsFilters]
  }
}

