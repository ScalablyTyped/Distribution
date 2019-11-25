package typings.braintree

import typings.braintree.braintreeMod.DiscountAddRequest
import typings.braintree.braintreeMod.DiscountUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddRemove extends js.Object {
  var add: js.UndefOr[js.Array[DiscountAddRequest]] = js.undefined
  var remove: js.UndefOr[js.Array[String]] = js.undefined
  var update: js.UndefOr[js.Array[DiscountUpdateRequest]] = js.undefined
}

object Anon_AddRemove {
  @scala.inline
  def apply(
    add: js.Array[DiscountAddRequest] = null,
    remove: js.Array[String] = null,
    update: js.Array[DiscountUpdateRequest] = null
  ): Anon_AddRemove = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddRemove]
  }
}

