package typings.braintree.anon

import typings.braintree.mod.DiscountAddRequest
import typings.braintree.mod.DiscountUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remove extends js.Object {
  var add: js.UndefOr[js.Array[DiscountAddRequest]] = js.undefined
  var remove: js.UndefOr[js.Array[String]] = js.undefined
  var update: js.UndefOr[js.Array[DiscountUpdateRequest]] = js.undefined
}

object Remove {
  @scala.inline
  def apply(
    add: js.Array[DiscountAddRequest] = null,
    remove: js.Array[String] = null,
    update: js.Array[DiscountUpdateRequest] = null
  ): Remove = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove]
  }
}

