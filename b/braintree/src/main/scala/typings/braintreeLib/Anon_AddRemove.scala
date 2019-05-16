package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddRemove extends js.Object {
  var add: js.UndefOr[js.Array[braintreeLib.braintreeMod.DiscountAddRequest]] = js.undefined
  var remove: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var update: js.UndefOr[js.Array[braintreeLib.braintreeMod.DiscountUpdateRequest]] = js.undefined
}

object Anon_AddRemove {
  @scala.inline
  def apply(
    add: js.Array[braintreeLib.braintreeMod.DiscountAddRequest] = null,
    remove: js.Array[java.lang.String] = null,
    update: js.Array[braintreeLib.braintreeMod.DiscountUpdateRequest] = null
  ): Anon_AddRemove = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_AddRemove]
  }
}

