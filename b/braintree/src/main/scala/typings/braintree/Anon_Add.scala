package typings.braintree

import typings.braintree.braintreeMod.AddOnAddRequest
import typings.braintree.braintreeMod.AddOnUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var add: js.UndefOr[js.Array[AddOnAddRequest]] = js.undefined
  var remove: js.UndefOr[js.Array[String]] = js.undefined
  var update: js.UndefOr[js.Array[AddOnUpdateRequest]] = js.undefined
}

object Anon_Add {
  @scala.inline
  def apply(
    add: js.Array[AddOnAddRequest] = null,
    remove: js.Array[String] = null,
    update: js.Array[AddOnUpdateRequest] = null
  ): Anon_Add = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Add]
  }
}

