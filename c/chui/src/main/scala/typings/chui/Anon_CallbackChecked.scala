package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackChecked extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var checked: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object Anon_CallbackChecked {
  @scala.inline
  def apply(
    callback: () => _ = null,
    checked: String = null,
    id: String = null,
    name: String = null,
    state: String = null,
    style: String = null,
    value: String | Double = null
  ): Anon_CallbackChecked = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (state != null) __obj.updateDynamic("state")(state)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackChecked]
  }
}

