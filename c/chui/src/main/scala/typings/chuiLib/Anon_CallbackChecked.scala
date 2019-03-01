package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackChecked extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var checked: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_CallbackChecked {
  @scala.inline
  def apply(
    callback: js.Function0[_] = null,
    checked: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    state: java.lang.String = null,
    style: java.lang.String = null,
    value: java.lang.String | scala.Double = null
  ): Anon_CallbackChecked = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (state != null) __obj.updateDynamic("state")(state)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackChecked]
  }
}

